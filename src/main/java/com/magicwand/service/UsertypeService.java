package com.magicwand.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Plan;
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
    
    /**
     * @implNote this service method takes care of fetching the Usertype details of a particular user.
     * @param Usertype Model object
     * @return the list of Usertype object of the passed usertype id in the request.
     * 
     */
    
    public Optional<Usertype> findByUsertypeId(Integer usertypeId) {
    	return repository.findById(usertypeId);
    }
    
	/**
     * @implNote this service method takes care of fetching all the usertype details.
     * @param none
     * @return the list of all usertype data.
     * 
     */
    public List<Usertype> findAllUsertypes() {
    	return repository.findAll();
    }

}

