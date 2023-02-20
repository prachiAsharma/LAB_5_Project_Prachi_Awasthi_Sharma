package com.glearning.employeesystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glearning.employeesystem.entity.Employee;
import com.glearning.employeesystem.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	private EmpRepository repository;
	
	public void addEmp(Employee e )
	{
		repository.save(e);
	}

	
	public List<Employee> getAllEmp() {
		return repository.findAll();
	}

	public Employee getEMpById(int id) {
		Optional<Employee> e = repository.findById(id);
		if (e.isPresent()) {
			return e.get();
		}
		return null;
	}

	public void deleteEMp(int id) {
		repository.deleteById(id);
	}

	

}
