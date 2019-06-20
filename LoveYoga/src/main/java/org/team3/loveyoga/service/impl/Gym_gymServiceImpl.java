package org.team3.loveyoga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.dao.GymaDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.CoachInfo;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Nickname;
import org.team3.loveyoga.pojo.Sign_gym;
import org.team3.loveyoga.service.Gym_gymService;
@Service("Gym_gymService")
public class Gym_gymServiceImpl implements Gym_gymService{
	@Autowired
	private GymaDao gymDao;
	
	@Override
	public int updateGym(Gym gym) {
		int i =gymDao.updateGym(gym);//返回影响行数
		
		return 0;
	}
	@Override
	public void insertByCidAndgcid(Integer cid, Integer gcid) {
		int i=gymDao.insertByCidAndgcid(cid,gcid);
		
	}
	@Override
	public CoachInfo selectCoach(String yc_telphone,Integer currentyg_id) {
		CoachInfo coach =gymDao.selectCoachIdByPhone(yc_telphone);
		if(coach==null){
			return null;
		}
		Integer coachId=coach.getYc_id();
		Sign_gym sign_gym =gymDao.SelectSignGymId(coachId);
		if(sign_gym.getYsg_flag()==0&&sign_gym.getYsg_cid()==currentyg_id){
			return coach;
		}
		return null;
	}
	@Override
	public Nickname selectNicknameByNicknameId(Integer yc_nicknameid) {
		Nickname nickName=gymDao.selectNicknameByNicknameId(yc_nicknameid);
		return nickName;
	}
	
}
