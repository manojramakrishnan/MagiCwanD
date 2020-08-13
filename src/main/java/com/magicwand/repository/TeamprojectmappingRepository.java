package com.magicwand.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.magicwand.entity.Teamprojectmapping;

public interface TeamprojectmappingRepository extends JpaRepository<Teamprojectmapping,Integer> {
}

