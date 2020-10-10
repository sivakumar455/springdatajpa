package com.ms.springdatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.springdatajpa.entity.Employee;
import com.ms.springdatajpa.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@PostMapping("/")
	public String addEmployee(@RequestBody Employee emp) {
		
		return employeeService.addEmployee(emp);
	}
	
	@PutMapping("/")
	public String updateEmployee(@RequestBody Employee emp) {
		
		return employeeService.updateEmployee(emp);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
}
