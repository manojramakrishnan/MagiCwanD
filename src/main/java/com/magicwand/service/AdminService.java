package com.magicwand.service;
import java.util.List;

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
    	
        return repository.save(usr);
    }

    /**
     * @implNote this service method takes care of fetching all the approved users.
     * @param User Model object
     * @return the List of users object with the status as parameter.
     * 
     */
	public List<User> getAllUsersByStatus(String status) {
		// TODO Auto-generated method stub
		return repository.getAllUsersByStatus(status);
	}
	
	/**
     * @implNote this service method takes care of fetching all the users.
     * @param none
     * @return the List of users object.
     * 
     */

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	/**
     * @implNote this service method takes care of updating all the user information.
     * @param User Object Model
     * @return user object.
     * 
     */
	public User updateUser(User user) {
		User existingUser = repository.findById(user.getUid()).orElse(null);
		existingUser.setUsertoken(user.getUsertoken());
		existingUser.setCreated_by(user.getCreated_by());
		existingUser.setCreated_dttm(user.getCreated_dttm());
		existingUser.setModified_by(user.getModified_by());
		existingUser.setModified_dttm(user.getCreated_dttm());
		existingUser.setPayment_status(user.getPayment_status());
		existingUser.setPlanId(user.getPlanId());
		existingUser.setRegId(user.getRegId());
		existingUser.setRoleTypeId(user.getRoleTypeId());
		existingUser.setStatus(user.getStatus());
		existingUser.setUserTypeId(user.getUserTypeId());
		
        return repository.save(existingUser);
	}

}
