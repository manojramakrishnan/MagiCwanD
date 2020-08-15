package com.magicwand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.magicwand.entity.Project;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
    
	@Query("select p from Project p, Application a, Organization o where p.project_id=o.project_id and p.project_id=a.project_id and p.project_id=:project_id")
	Project findByProject_Id(Integer project_id);
}
