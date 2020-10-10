package com.ms.springdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.springdatajpa.entity.Employee;
import com.ms.springdatajpa.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> findAll(){
		return (List<Employee>) employeeRepository.findAll();
	}

	public String addEmployee(Employee emp) {
		String response;
		
		if(employeeRepository.save(emp) != null ) {
			response = "SUCCESS";
			
		}else {
			response = "FAIL";
		}
		
		return response;
	}

	public String updateEmployee(Employee emp) {
		
		String response;
		
		if(employeeRepository.save(emp) != null ) {
			response = "SUCCESS";
			
		}else {
			response = "FAIL";
		}
		
		return response;
	}

	public String deleteEmployee(int id) {
		String response;
		
		try {
			employeeRepository.deleteById(id);
			response = "SUCCESS";
		} catch (IllegalArgumentException e) {
			
			//e.printStackTrace();
			// add comment
			response = "FAIL";
		}
	
		
		return response;
	}
}
