package com.magicwand.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Usertype;
import com.magicwand.repository.UsertypeRepository;
/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals with different users of the application. Users include user, admin and super admin.
 * @version 1.0
 * {@code done on: 07-08-2020}
 */

@Service
public class UsertypeService {
    @Autowired
    private UsertypeRepository repository;

    /**
     * @implNote this service method takes care of different user types of the application.
     * @param usertype Model object
     * @return the saved Usertype object with the usertype id.
     * 
     */
    public Usertype usertype(Usertype usrtype) {
        return repository.save(usrtype);
    }
}
