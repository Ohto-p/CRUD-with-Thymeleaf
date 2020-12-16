package com.indra.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.curso.entity.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region,Integer>{
	
}
