package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployeeList()
	{
		return employeeRepository.findAll();	
	}
	
	public Employee getEmployee(long id)
	{
		return employeeRepository.findById(id).get();
	}

	public Employee createEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	public Employee updateEmployee(Employee emp)
	{
		return employeeRepository.save(emp);
	}
	
	public void deleteEmployee(long id)
	{
		employeeRepository.deleteById(id);
	}
}
