package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	@GetMapping("getEmployeeList")
	public List<Employee> getEmployeeList()
	{
		return employeeService.getEmployeeList();	
	}
	
	@GetMapping("getEmployeedetails")
	public Employee getEmployee(@PathVariable("id") long id)
	{
		return employeeService.getEmployee(id);
	}

	@PostMapping("createEmployee")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return employeeService.createEmployee(emp);
	}
	
	
	@PutMapping("updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return employeeService.updateEmployee(emp);
	}
	
	@DeleteMapping("deleteEmployee")
	public void deleteEmployee(@PathVariable("id") long id)
	{
		employeeService.deleteEmployee(id);
	}
}

