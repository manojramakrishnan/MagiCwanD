package com.magicwand.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Plan;
import com.magicwand.entity.Role;
import com.magicwand.repository.RoleRepository;


/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals with different user roles of the application. Roles include managers, contributors and executors.
 * @version 1.0
 * {@code done on: 07-08-2020}
 */

@Service
public class RoleService {
	 @Autowired
	    private RoleRepository repository;

	    /**
	     * @implNote this service method takes care of different user roles of the application.
	     * @param roletype Model object
	     * @return the saved Role object with the role id.
	     * 
	     */
	    public Role role(Role rle) {
	        return repository.save(rle);
	    }
	    /**
	     * @implNote this service method takes care of fetching the role details of a particular role id.
	     * @param Role Model object
	     * @return the list of Role object of the passed role id in the request.
	     * 
	     */
	    
	    public Optional<Role> findByRoleId(Integer roleId) {
	    	return repository.findById(roleId);
	    }
	    
		/**
	     * @implNote this service method takes care of fetching all the role details.
	     * @param none
	     * @return the list of all Role data.
	     * 
	     */
	    public List<Role> findAllRoles() {
	    	return repository.findAll();
	    }

}
