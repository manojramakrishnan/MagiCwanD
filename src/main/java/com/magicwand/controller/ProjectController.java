package com.magicwand.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Project;
import com.magicwand.entity.Registration;
import com.magicwand.service.ProjectService;
import com.magicwand.service.UserService;


/**
 * 
 * @author Anjali George
 * @implNote This is the project module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 13-08-2020}
 *
 */
@RestController

public class ProjectController {
	@Autowired
    private ProjectService service;

    /**
     * @apiNote This api method save the details of a project.
     * @param Project Model object
     * @return an Object of Project
     */
    @PostMapping("/addproject")
    public Project project(@RequestBody Project prjt) {
        return service.project(prjt);
    }
    
}
