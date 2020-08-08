package com.magicwand.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.magicwand.entity.User;
import com.magicwand.repository.AdminRepository;

/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals all the real time user related service processing.
 * @version 1.0
 * {@code done on: 06-08-2020}
 */

@Service

public class AdminService {
	@Autowired
    private AdminRepository repository;

    /**
     * @implNote this service method takes care of registering the new user details.
     * @param registration Model object
     * @return the saved Registration object with the generated registration id.
     * 
     */
    public User user(User usr) {
    	usr.setRegistration(usr.getRegistration());
    	usr.setUsertype(usr.getUsertype());
    	usr.setRole(usr.getRole());
    	usr.setPlan(usr.getPlan());
        return repository.save(usr);
    }

}
