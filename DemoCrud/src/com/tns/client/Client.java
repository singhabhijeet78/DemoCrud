package com.tns.client;

import com.tns.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

		public static void main(String[] args) {
//Debug this program as Debug -> Debug as Java Application

//CRUD operation calling activity
		StudentService service = new StudentServiceImpl();
		Student student = new Student();
		
		//CRUD OPERATIONS
////		// Create Operation		
//		student.setStudentId(1);
//		student.setName("SAGAR");
//		service.addStudent(student);		
		
	// Retrieve Operation
		service.findStudentById(1234);
		System.out.println("ID is: "+student.getStudentId());
		System.out.println("Name is: "+student.getName());
				
		//Update Operation
//		student  =service.findStudentById(1);
//		student.setName("RAKHI");
//		service.updateStudent(student);
				
		// Delete Operation
//		student=service.findStudentById(7);
//		service.removeStudent(student);
//		System.out.println("Row removed");
System.out.println("End of program/Life cycle completed..."); 
} }