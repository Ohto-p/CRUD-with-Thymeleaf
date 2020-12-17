package com.indra.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.curso.entity.Jobhistory;

@Repository
public interface JobHistoryRepository extends JpaRepository<Jobhistory, Integer> {

}
