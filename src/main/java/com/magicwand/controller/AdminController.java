package com.magicwand.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.User;
import com.magicwand.service.AdminService;
/**
 * 
 * @author Anjali George
 * @implNote This is the Admin module controller which is used for Approve or Reject the registered user and stores the real time data of a user.
 * @version 1.0
 * {@code done on: 06-08-2020}
 *
 */
@RestController

public class AdminController {
	@Autowired
    private AdminService service;

    /**
     * @apiNote This api method save the real time details of a user.
     * @param User Model object
     * @return an Object of User
     */
    @PostMapping("/approveOrRejectUser")
    public User user(@RequestBody User usr) {
        return service.user(usr);
    }
    
    /**
     * @apiNote This api method get all the approved users.
     * @param status String
     * @return an Object of User List
     */
    @GetMapping("/getAllUsersByStatus/{status}")
    public List<User> getAllUsersByStatus(@PathVariable String status) {
    	return service.getAllUsersByStatus(status);
    }
    
    /**
     * @apiNote This api method get all the users.
     * @param none
     * @return an Object of User List
     */
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
    	return service.getAllUsers();
    }
    
    /**
     * @apiNote This api method update the user information.
     * @param User Object Model
     * @return an Object of User
     */
    @PutMapping("/userDetailsupdate")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    }


