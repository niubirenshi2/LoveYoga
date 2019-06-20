package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.team3.loveyoga.dao.UserDao;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.pojo.User;
import org.team3.loveyoga.service.UserService;


@Service("userService")
@Transactional
public class UserSeriveImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//学员手机号注册
	@Override
	public void addUserByTel(User user) {
		userDao.addUserByTel(user);
	}

	/*//通过手机查密码（登录）
	@Override
	public String findPasswordByTel(String yu_tel) {
		// TODO Auto-generated method stub
		return userDao.findPasswordByTel(yu_tel);
	}*/
	//学员用户名注册
	@Override
	public void addUserByName(User user) {
		userDao.addUserByName(user);
		
	}
	/*//通过用户名查密码（登录）
	@Override
	public String findPasswordByName(String yu_name) {
		// TODO Auto-generated method stub
		return userDao.findPasswordByName(yu_name);
	}*/

	@Override
	public int findIdByName(String yu_name) {
		// TODO Auto-generated method stub
		return userDao.findIdByName(yu_name);
	}

	@Override
	public int findIdByTel(String yu_tel) {
		// TODO Auto-generated method stub
		return userDao.findIdByTel(yu_tel);
	}

	

}
