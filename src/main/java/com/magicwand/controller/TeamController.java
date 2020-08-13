package com.magicwand.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.magicwand.entity.Role;
import com.magicwand.entity.Team;
import com.magicwand.service.RoleService;
import com.magicwand.service.TeamService;


/**
 * 
 * @author Anjali George
 * @implNote This is the team module controller which redirect the incoming http service requests to 
 * the service layer.
 * @version 1.0
 * {@code done on: 12-08-2020}
 *
 */
@RestController

public class TeamController {
	@Autowired
    private TeamService service;

    /**
     * @apiNote This api method save the details of  different teams.
     * @param Team Model object
     * @return an Object of Team
     */
	@PostMapping("/addteam")
    public Team team(@RequestBody Team tm) {
        return service.team(tm);
    }
}
