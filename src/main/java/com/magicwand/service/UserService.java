package com.magicwand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Registration;
import com.magicwand.repository.UserRepository;

/**
 * 
 * @author Manoj Ramakrishnan
 * @implNote This Service Class deals all the user related service processing.
 * @version 1.0
 * {@code done on: 05-08-2020}
 */

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    /**
     * @implNote this service method takes care of registering the new user details.
     * @param registration Model object
     * @return the saved Registration object with the generated registration id.
     * 
     */
    public Registration register(Registration regn) {
    	regn.setPlan(regn.getPlan());
        return repository.save(regn);
    }

   
}
