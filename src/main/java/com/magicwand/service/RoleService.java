package com.magicwand.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Role;
import com.magicwand.entity.Usertype;
import com.magicwand.repository.RoleRepository;
import com.magicwand.repository.UsertypeRepository;

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

}
