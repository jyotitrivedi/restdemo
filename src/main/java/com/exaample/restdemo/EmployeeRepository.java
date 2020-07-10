package com.exaample.restdemo;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class EmployeeRepository {
	
	List<Employee> employees = new ArrayList<Employee>();

	public EmployeeRepository() {
		
		Employee e1= new Employee();
		e1.setId(1);
		e1.setName("Jyoti");
		Employee e2= new Employee();
		e2.setId(2);
		e2.setName("Mohit");
		employees.add(e1);
		employees.add(e2);
		
	}
	public List<Employee> getEmployees(){
		return employees;
	}
	public Employee getEmployeeById(int id){
		
		for(Employee e : employees){
			if(e.getId() == id)
				return e;
		}
		return null;
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	

}
