package org.team3.loveyoga.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.CoachDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.CoachService;

@Service
public class CoachServiceImpl implements CoachService{

	@Autowired
	private CoachDao coachDao;
	


	@Override
	public boolean addInfo(Coach coach) {
		
		if (coach.getNickname()==null) {
			
			
		}
		
		boolean re = coachDao.addInfo(coach);
		return re;
	}

}
