package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.pojo.User;

public interface UserService {
	//学员手机注册账号
	public void addUserByTel(User user);
	//学员用户名注册账号
	public void addUserByName(User user);
	
	public int findIdByName(String yu_name);
	
	public int findIdByTel(String yu_tel);
	/*//学员手机号登录
	public String findPasswordByTel(String yu_tel);
	//学员用户名登录
	public String findPasswordByName(String yu_name);*/
}
