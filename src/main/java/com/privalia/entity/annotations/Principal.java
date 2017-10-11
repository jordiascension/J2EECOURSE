package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.privalia.presentation.HelloWorld;

public class Principal {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext annotationContext =
				 new AnnotationConfigApplicationContext();
		
		 annotationContext.scan("com.privalia.entity.annotations");
		 annotationContext.refresh();
		   
		   Student student = 
		    		annotationContext.getBean(Student.class);
		   
	    StringBuilder stringBuilder = new StringBuilder();
	    stringBuilder.append(student.getIdStudent());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getName());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getSurname());
	    stringBuilder.append(" ");
	    stringBuilder.append(student.getAge());
	    System.out.println(stringBuilder.toString());
	    
	    annotationContext.close();

	}
}
	
