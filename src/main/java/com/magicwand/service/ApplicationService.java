package com.magicwand.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Application;
import com.magicwand.entity.Role;
import com.magicwand.repository.ApplicationRepository;
import com.magicwand.repository.RoleRepository;


/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals with different applications used in a project.
 * @version 1.0
 * {@code done on: 12-08-2020}
 */

@Service
public class ApplicationService {
	 @Autowired
	    private ApplicationRepository repository;

	    /**
	     * @implNote this service method takes care of different applications.
	     * @param application Model object
	     * @return the saved Application object with the application id.
	     * 
	     */
	    public Application application(Application app) {
	        return repository.save(app);
	    }

}