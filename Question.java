package org.constructor;

public class Question {
	
	public static void main(String[] args) {
		
		Question obj=new Question("jaya", 122343);
		
	}
	
	String name;
	int code;
	Question(String name,int code){
			
		System.out.println("Defalut constructor");
		
		System.out.println("my name is saravanan :"  +name);
		System.out.println("Defalut constructor:"   +code);
	}
	
	
		
		
	}

