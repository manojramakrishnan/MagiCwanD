package com.magicwand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magicwand.entity.Team;

public interface TeamRepository extends JpaRepository<Team,Integer> {
    
}
