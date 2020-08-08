package com.magicwand.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Plan;
import com.magicwand.service.PlanService;

/**
 * 
 * @author Anjali George
 * @implNote This is the Plan module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 07-08-2020}
 *
 */

@RestController

public class PlanController {
	@Autowired
    private PlanService service;

    /**
     * @apiNote This api method save the details of different membership plans available in the application.
     * @param Plan Model object
     * @return an Object of Plan
     */
    @PostMapping("/saveplan")
    public Plan plan(@RequestBody Plan pln) {
        return service.plan(pln);
    }

}
