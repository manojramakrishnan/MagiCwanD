package com.magicwand.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magicwand.entity.Project;
import com.magicwand.entity.Teamprojectmapping;
import com.magicwand.repository.ProjectRepository;
import com.magicwand.repository.TeamprojectmappingRepository;



/**
 * 
 * @author Anjali George
 * @implNote This Service Class deals all the team project mapping related service processing.
 * @version 1.0
 * {@code done on:13-08-2020}
 */

@Service
public class TeamprojectmappingService {
	@Autowired
    private TeamprojectmappingRepository repository;

    /**
     * @implNote this service method takes care of adding the new team project mapping details details.
     * @param team project mapping Model object
     * @return the saved team project mapping object with the generated team project mapping id.
     * 
     */
    public Teamprojectmapping teamprojectmapping(Teamprojectmapping tmprjmp) {
//    	regn.setPlan(regn.getPlan());
        return repository.save(tmprjmp);
    }


}
