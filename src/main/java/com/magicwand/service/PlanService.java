package com.magicwand.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Plan;
import com.magicwand.repository.PlanRepository;

/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals with different membership plans availble in the application. Plan types include basic plan, advanced and premium.
 * @version 1.0
 * {@code done on: 07-08-2020}
 */

@Service

public class PlanService {
	 @Autowired
	    private PlanRepository repository;

	    /**
	     * @implNote this service method takes care of different membership plans available in the application
	     * @param plan Model object
	     * @return the saved plan object with the plan id.
	     * 
	     */
	    public Plan plan(Plan pln) {
	        return repository.save(pln);
	    }

}
