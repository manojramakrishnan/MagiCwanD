package com.magicwand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.magicwand.entity.Project;
public interface ProjectRepository extends JpaRepository<Project,Integer> {
    
}
