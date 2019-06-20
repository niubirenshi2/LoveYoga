package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.User;


public interface UserDao {

	//学员手机注册账号
	@Insert("insert into y_user(yu_tel,yu_password,yu_rid) values(#{yu_tel},#{yu_password},1001)")
	public void addUser(User user);
	
	//学员手机号登录
	@Select("select yu_password from y_user where yu_tel=#{yu_tel} and flag=0")
	public String findPasswordByTel(String yu_tel);
}
