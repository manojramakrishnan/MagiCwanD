package com.magicwand.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Project;
import com.magicwand.repository.ProjectRepository;


/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals all the project related service processing.
 * @version 1.0
 * {@code done on:13-08-2020}
 */

@Service
public class ProjectService {
	 @Autowired
	    private ProjectRepository repository;

	    /**
	     * @implNote this service method takes care of adding the new project details.
	     * @param project Model object
	     * @return the saved project object with the generated project id.
	     * 
	     */
	    public Project project(Project prjt) {
//	    	regn.setPlan(regn.getPlan());
	        return repository.save(prjt);
	    }

}
