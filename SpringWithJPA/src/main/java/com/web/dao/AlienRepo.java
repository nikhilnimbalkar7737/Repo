package com.web.dao;

import java.util.List;

import org.hibernate.validator.constraints.URL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	List<Alien> findBytech(String string);

	List<Alien> findByaidGreaterThan(int i);

	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findBytechSorted(String tech);

	
}
