package com.indra.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.curso.entity.Jobs;
@Repository
public interface JobRepository extends JpaRepository <Jobs,String> {
	
}
