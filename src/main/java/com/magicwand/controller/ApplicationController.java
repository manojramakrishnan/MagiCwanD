package com.magicwand.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Application;
import com.magicwand.service.ApplicationService;



/**
 * 
 * @author Anjali George
 * @implNote This is the application module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 12-08-2020}
 *
 */
@RestController
public class ApplicationController {
	@Autowired
    private ApplicationService service;

    /**
     * @apiNote This api method save the details of an application.
     * @param Application Model object
     * @return an Object of application 
     */
	@PostMapping("/addapplication")
    public Application application(@RequestBody Application app) {
        return service.application(app);
    }
}
