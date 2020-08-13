package com.magicwand.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Organization;
import com.magicwand.entity.Role;
import com.magicwand.service.OrganizationService;
import com.magicwand.service.RoleService;

/**
 * 
 * @author Anjali George
 * @implNote This is the organization module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 12-08-2020}
 *
 */
@RestController
public class OrganizationController {
	@Autowired
    private OrganizationService service;

    /**
     * @apiNote This api method save the details of an organization.
     * @param Organization Model object
     * @return an Object of organization
     */
	@PostMapping("/addorganization")
    public Organization organization(@RequestBody Organization org) {
        return service.organization(org);
    }

}
