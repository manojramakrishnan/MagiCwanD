package com.magicwand.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Usertype;
import com.magicwand.service.UsertypeService;

/**
 * 
 * @author Anjali George
 * @implNote This is the usertype module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 07-08-2020}
 *
 */
@RestController
public class UsertypeController {
	@Autowired
    private UsertypeService service;

    /**
     * @apiNote This api method save the details of roles of different users.
     * @param Usertype Model object
     * @return an Object of Usertype
     */
    @PostMapping("/saveusertype")
    public Usertype usertype(@RequestBody Usertype usrtype) {
        return service.usertype(usrtype);
    }


}
