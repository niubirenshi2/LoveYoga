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

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public String findPasswordByTel(String yu_tel) {
		// TODO Auto-generated method stub
		return userDao.findPasswordByTel(yu_tel);
	}

	

}
