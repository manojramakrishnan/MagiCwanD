package com.magicwand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magicwand.entity.Application;


public interface ApplicationRepository extends JpaRepository<Application,Integer> {
    
}
