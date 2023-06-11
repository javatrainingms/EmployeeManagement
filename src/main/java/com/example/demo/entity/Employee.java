package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String name;
	private String addess;
	private double salary;
	private char gender;

}
