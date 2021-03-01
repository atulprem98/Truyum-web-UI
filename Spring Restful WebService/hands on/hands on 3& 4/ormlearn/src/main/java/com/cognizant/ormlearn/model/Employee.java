package com.cognizant.ormlearn.model;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class Employee {

	@NotNull
	@NumberFormat(style=Style.NUMBER)
	private int id;	
	
	@NotNull
	@Size(min = 1, max = 30, message = "Name should contain between 1 and 30 characters")
	private String name;
	
	@NotNull
	@DecimalMin(value="0")
	private double salary;	
	@NotNull
	private boolean permanent;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	private Department department;
	private Set<Skill> skillList;
	public int getId() {
		return id;
	}
	
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Set<Skill> getSkillList() {
		return skillList;
	}


	public void setSkillList(Set<Skill> skillList) {
		this.skillList = skillList;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return permanent;
	}
	public void setPermanent(boolean permanent) {
		this.permanent = permanent;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", permanent=" + permanent
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	

}
