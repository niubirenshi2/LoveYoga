package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.pojo.User;


public interface UserDao {

	//学员手机注册账号
	@Insert("insert into y_user(yu_tel,yu_password,yu_rid) values(#{yu_tel},#{yu_password},1001)")
	public void addUserByTel(User user);
	
	//用户名注册账号
	@Insert("insert into y_user(yu_name,yu_password,yu_rid) values(#{yu_name},#{yu_password},1001)")
	public void addUserByName(User user);
	
	//手机号查找id，用来注册时插入学员表的uid
	@Select("select * from y_user where yu_tel=#{yu_tel} and flag=0")
	public int findIdByTel(String yu_tel);
	//用户名查找id，用来注册时插入学员表的uid
	@Select("select * from y_user where yu_name=#{yu_name} and flag=0")
	public int findIdByName(String yu_name);
	
	/*//学员手机号登录
	@Select("select yu_password from y_user where yu_tel=#{yu_tel} and flag=0")
	public String findPasswordByTel(String yu_tel);
	
	//学员用户名登录
	@Select("select yu_password from y_user where yu_name=#{yu_name} and flag=0")
	public String findPasswordByName(String yu_name);*/
}
