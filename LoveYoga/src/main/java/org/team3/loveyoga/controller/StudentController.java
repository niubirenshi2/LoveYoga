package org.team3.loveyoga.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource
	private StudentService studentService;
	
	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/register")
	public String register(Student student){
		System.out.println("....");
		studentService.addStudent(student);
		return "/html/login.html";
	}
}
