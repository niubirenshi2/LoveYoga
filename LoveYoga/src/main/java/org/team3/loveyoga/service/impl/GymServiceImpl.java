package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.GymDao;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.service.GymService;

@Service("gymService")
public class GymServiceImpl implements GymService {
	@Resource
	private GymDao gymDao;
	public GymDao getGymDao() {
		return gymDao;
	}
	public void setGymDao(GymDao gymDao) {
		this.gymDao = gymDao;
	}

	@Override
	public Gym findGymByUid(int uid) {
		return gymDao.findGymByUid(uid);
	}

}
