package com.sr.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sr.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "alien", path = "alien")
public interface AlienDAO extends JpaRepository<Alien, Integer>{
}