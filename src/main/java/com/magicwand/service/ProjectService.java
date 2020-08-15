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
	    /**
	     * @implNote this service method takes care of fetching the project details based on project id.
	     * @param project object
	     * @return the list of project object of the passed project id in the request.
	     * 
	     */
	    //@Qualifier(value = "com.magicwand.repository.UserRepositoryImpl")
	    public Project findByProject_Id(Integer project_id) {
	    	System.err.println("project in controller"+project_id);
	    	return repository.findByProject_Id(project_id);
	    }

	    /**
	     * @implNote this service method takes care of fetching the project details.
	     * @param none
	     * @return the list of project object.
	     * 
	     */
	    
	    public Iterable<Project> findAllProjects() {
	    	
	    	return repository.findAll();
	    }
	    
	    /**
	     * @implNote this service method takes care of fetching all projects based on organization id.
	     * @param Integer organization id
	     * @return the list of project object.
	     * 
	     */
	    
	    
		public List<Project> findProjectByOrganizationId(Integer organization_id) {
			// TODO Auto-generated method stub
			return repository.findProjectByOrganizationId(organization_id);
		}
}
