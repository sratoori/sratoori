package com.sr.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sr.demo.model.Alien;

//public interface AlientDAO extends CrudRepository<Alien, Integer>{
public interface AlientDAO extends JpaRepository<Alien, Integer>{

	public List <Alien> findByAtech(String tech);

	public List <Alien> findByAidGreaterThan(int aid);

	@Query("from Alien where atech=?1 order by aname")
	public List <Alien> getByAtechSortedByAname(String tech);

}
