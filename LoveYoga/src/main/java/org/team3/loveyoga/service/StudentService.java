package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Student;

public interface StudentService {

	public void addStudent(Student student);
	
	public Student findStudentByTel(String ys_tel);
}
