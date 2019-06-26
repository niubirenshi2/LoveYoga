package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.UserinfoDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserinfoDao userinfoDao;
	
	
	public UserinfoDao getUserinfoDao() {
		return userinfoDao;
	}


	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}


	@Override
	public Coach findCoachInfo(Integer uid) {
		return userinfoDao.findCoachInfo(uid);
	}


	@Override
	public Student findStudentInfo(Integer uid) {
		// TODO Auto-generated method stub
		return userinfoDao.findStudentInfo(uid);
	}


	@Override
	public Gym findGymInfo(Integer uid) {
		return userinfoDao.findGymInfo(uid);
	}

	
}
