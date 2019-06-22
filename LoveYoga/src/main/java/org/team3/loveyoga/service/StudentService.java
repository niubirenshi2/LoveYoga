package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Student;

public interface StudentService {
	
	//通过uid查找学员
	public Student findStudentByUid(int userID);
	//通过学员编号查询学员信息
	public Student findStudentByStudentID(int studentID);
}
