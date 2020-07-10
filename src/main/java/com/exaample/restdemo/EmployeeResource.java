package com.exaample.restdemo;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/employees")
public class EmployeeResource {
	
	EmployeeRepository repository = new EmployeeRepository();
	
	@GET 
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Employee> getEmployees(){
		
		return repository.getEmployees();
		
	}
	
	@POST
	@Path("/employee")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee addEmployee(Employee e){
		System.out.println(e);
		repository.addEmployee(e);
		return e;
	}
	
	@GET 
	@Path("employee/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Employee getEmployeeById(@PathParam("id") int id){
		
		return repository.getEmployeeById(id);
	
		
		
	}
	
	

}
