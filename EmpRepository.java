package com.glearning.employeesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glearning.employeesystem.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee ,Integer >{
	

}
