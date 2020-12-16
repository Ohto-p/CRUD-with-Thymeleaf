package com.indra.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.indra.curso.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//Aqui van las consultas que no sean directas, o con condficones where
	//En caso de que si se hacen los metodos
}
