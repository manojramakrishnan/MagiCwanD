package com.magicwand.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Application;
import com.magicwand.entity.Organization;
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
	/**
     * @apiNote This api method get the data of a particular application Id.
     * @param Application Id Integer
     * @return an Object of application
     */
    @GetMapping("/getApplicationById/{appId}")
    public Optional<Application> findAppById(@PathVariable Integer appId) {
    	return service.findByAppId(appId);
    }

    /**
     * @apiNote This api method fetch all the application data.
     * @param none
     * @return an List of Application object
     */
    @GetMapping("/getAllApplications")
    public List<Application> findAllApplications() {
    	return service.findAllApplications();
    }
    
}
