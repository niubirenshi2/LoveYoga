package org.team3.loveyoga.service.impl;


import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.CoachDao;
import org.team3.loveyoga.Dao.CoachInfoDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.service.CoachService;
@Service
public class CoachServiceImpl implements CoachService{

	@Autowired
	private CoachDao coachDao;
	
	@Autowired
	private CoachInfoDao coachInfoDao;
	
	public CoachDao getCoachDao() {
		return coachDao;
	}


	public void setCoachDao(CoachDao coachDao) {
		this.coachDao = coachDao;
	}


	@Override
	public boolean addCoach(Coach coach) {
		boolean result = false;	
		//给前端输入的密码加密
		String pwd = new SimpleHash("MD5", coach.getYu_password(), coach.getYu_name(), 1024).toString();
		//将新加密的密码返回给对象
		coach.setYu_password(pwd);	
		//设置角色的属性
		coach.setYu_rid(1);			
//		System.out.println(coach);
		result = coachDao.addCoach(coach);
		String name = coach.getYu_name();
		//通过账号名称来查询到注册账号的主键
		Integer id = coachDao.findIdByName(name);
//		System.out.println("注册账户主键："+id);
		//将注册账号主键插入到教练信息表中关联导UID
		boolean re = coachInfoDao.addUid(id);
		 if (result && re) {
			 //两条插入同时成功才能注册成功
			result = true;		
			return result;
		 }
		 //如果插入失败，已经插入到登录表中的数据要失效
		coachDao.setFlag(id);	
		return result;
	}


	@Override
	public Integer findCoach(String account) {
		return coachDao.findCoachById(account);
	}

}
