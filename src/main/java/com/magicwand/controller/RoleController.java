package com.magicwand.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Plan;
import com.magicwand.entity.Role;
import com.magicwand.service.RoleService;



/**
 * 
 * @author Anjali George
 * @implNote This is the roletype module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 07-08-2020}
 *
 */
@RestController
public class RoleController {
	@Autowired
    private RoleService service;

    /**
     * @apiNote This api method save the details of  different user roles such as managers, contributors and executors.
     * @param Role Model object
     * @return an Object of Role
     */
	@PostMapping("/addrole")
    public Role role(@RequestBody Role rle) {
        return service.role(rle);
    }
	/**
     * @apiNote This api method get the data of a particular role Id.
     * @param Role Id Integer
     * @return an Object of Role
     */
    @GetMapping("/getRoleById/{roleId}")
    public Optional<Role> findRoleById(@PathVariable Integer roleId) {
    	return service.findByRoleId(roleId);
    }

    /**
     * @apiNote This api method fetch all the role data.
     * @param none
     * @return an List of Role object
     */
    @GetMapping("/getAllRoles")
    public List<Role> findAllRoles() {
    	return service.findAllRoles();
    }

    

}