package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;

public interface StudentDao {
	
	//手机注册账号
	@Insert("insert into y_student(ys_tel,ys_pwd,ys_createtime,ys_updatetime) values(#{ys_tel},#{ys_pwd},#{ys_createtime},#{ys_updatetime})")
	public void addStudentByTel(Student student);
	
	//用户名注册账号
	@Insert("insert into y_student(ys_name,ys_pwd,ys_createtime,ys_updatetime) values(#{ys_name},#{ys_pwd},#{ys_createtime},#{ys_updatetime})")
	public void addStudentByName(Student student);
	
	//根据手机号查找账号
	@Select("select * from y_student where ys_tel=#{ys_tel}")
	public Student findStudentByTel(String ys_tel);
	
	//根据用户名查找账号
	@Select("select * from y_student where ys_name=#{ys_name}")
	public Student findStudentByName(String ys_name);
	
	//插入uid
	@Insert("insert into y_student(ys_uid) values(#{ys_uid})")
	public void addUid(int ys_uid);
}
