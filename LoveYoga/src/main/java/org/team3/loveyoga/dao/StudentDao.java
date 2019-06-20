package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;

public interface StudentDao {
	
	//注册账号
	@Insert("insert into y_student(ys_tel,ys_pwd,ys_createtime,ys_updatetime) values(#{ys_tel},#{ys_pwd},#{ys_createtime},#{ys_updatetime})")
	public void addStudent(Student student);
	
	//根据手机号查找账号
	@Select("select * from y_student where ys_tel=#{ys_tel}")
	public Student findStudentByTel(String ys_tel);
}
