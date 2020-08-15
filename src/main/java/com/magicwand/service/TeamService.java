package com.magicwand.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Organization;
import com.magicwand.entity.Role;
import com.magicwand.entity.Team;
import com.magicwand.repository.RoleRepository;
import com.magicwand.repository.TeamRepository;


/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals with different teams of the application.
 * @version 1.0
 * {@code done on: 13-08-2020}
 */

@Service
public class TeamService {
	@Autowired
    private TeamRepository repository;

    /**
     * @implNote this service method takes care of different teams of the application.
     * @param team Model object
     * @return the saved team object with the team id.
     * 
     */
    public Team team(Team tm) {
        return repository.save(tm);
    }
    /**
     * @implNote this service method takes care of fetching the team details of a particular team id.
     * @param Team Model object
     * @return the list of Team object of the passed team id in the request.
     * 
     */
    
    public Optional<Team> findByTeamId(Integer teamId) {
    	return repository.findById(teamId);
    }
    
	/**
     * @implNote this service method takes care of fetching all the team details.
     * @param none
     * @return the list of all team data.
     * 
     */
    public List<Team> findAllTeams() {
    	return repository.findAll();
    }
    

}
