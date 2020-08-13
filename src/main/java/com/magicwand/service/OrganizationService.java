package com.magicwand.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Organization;
import com.magicwand.entity.Role;
import com.magicwand.repository.OrganizationRepository;
import com.magicwand.repository.RoleRepository;

/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals with different organizations of the application. 
 * @version 1.0
 * {@code done on: 12-08-2020}
 */

@Service
public class OrganizationService {
	@Autowired
    private OrganizationRepository repository;

    /**
     * @implNote this service method takes care of different organizations of the application.
     * @param organization Model object
     * @return the saved organization object with the organization id.
     * 
     */
    public Organization organization(Organization org) {
        return repository.save(org);
    }

}