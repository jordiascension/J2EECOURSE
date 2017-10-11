package com.privalia.entity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.privalia.presentation.HelloWorld;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext("spring-config.xml");
		
	    Student student = 
	    		(Student)context.getBean("student");
	    
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append(student.getIdStudent());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getName());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getSurname());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getAge());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getAddress().getIdAddress());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getAddress().getStreet());
	    System.out.println(stringBuilder.toString());
	    
	    Student studentConstructor = 
	    		(Student)context.getBean("studentConstructor");
	    
	    StringBuilder stringBuilderConstructor =
	    		new StringBuilder();
	    stringBuilderConstructor.append(
	    		studentConstructor.getIdStudent());
	    stringBuilderConstructor.append(" ");
	    stringBuilderConstructor.append(studentConstructor.getName());
	    stringBuilderConstructor.append(" ");
	    stringBuilderConstructor.append(studentConstructor.getSurname());
	    stringBuilderConstructor.append(" ");
	    stringBuilderConstructor.append(studentConstructor.getAge());
	    stringBuilderConstructor.append(" ");
	    stringBuilderConstructor.append(studentConstructor.
	    		getAddress().getIdAddress());
	    stringBuilderConstructor.append(" ");
	    stringBuilderConstructor.append(studentConstructor.getAddress().getStreet());
	    System.out.println(stringBuilderConstructor.toString());
	        
	    context.close();

	}
}
	
