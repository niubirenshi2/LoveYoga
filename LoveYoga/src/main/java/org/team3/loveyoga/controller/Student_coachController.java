package org.team3.loveyoga.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.Student_coachService;

@Controller
@RequestMapping("/user")
public class Student_coachController {
	@Resource
	private Student_coachService student_coachService;

	public Student_coachService getStudent_coachService() {
		return student_coachService;
	}

	public void setStudent_coachService(Student_coachService student_coachService) {
		this.student_coachService = student_coachService;
	}
	
	@RequestMapping("/myStudent")
	@ResponseBody
	public List<Student> myStudent(){
		//需要提供我的cid
		Integer cid=2001;
		List<Student> list=student_coachService.myStudents(cid);
		return list;
	}
	
}
