package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Student;

public interface StudentService {
	//手机注册账号
	public void addStudentByTel(Student student);
	//用户名注册账号
	public void addStudentByName(Student student);
	//根据手机号查找账号（注册）
	public Student findStudentByTel(String ys_tel);
	//根据用户名查找账号（注册）
	public Student findStudentByName(String ys_name);
	//插入uid
	public void addUid(int ys_uid);
}
