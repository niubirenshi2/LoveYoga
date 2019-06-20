package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.User;

public interface UserService {
	//学员手机注册账号
	public void addUser(User user);
	//学员手机号登录
	public String findPasswordByTel(String yu_tel);
}
