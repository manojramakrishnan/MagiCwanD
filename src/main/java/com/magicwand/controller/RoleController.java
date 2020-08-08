package com.magicwand.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
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


}
