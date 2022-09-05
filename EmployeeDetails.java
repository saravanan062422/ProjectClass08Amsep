package org.constructor;

public class EmployeeDetails {
	
	
	String name;
	int salary;
	
	
	EmployeeDetails(String name,int salary){
		
		System.out.println("employee name is:" +name);
		System.out.println("employee salary is:" +salary);
		
	}
	
	public static void main(String[] args) {
		
		 EmployeeDetails obj=new EmployeeDetails("jaya", 132323);
		
		
		
	}
	
	
	
	
}