package org.team3.loveyoga.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team3.loveyoga.Dao.FillDao;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.service.FillService;
import org.team3.loveyoga.utils.GetNickName;

@Service
public class FillServiceImpl implements FillService {

	@Autowired
	private FillDao fillDao;
	

	public FillDao getFillDao() {
		return fillDao;
	}

	public void setFillDao(FillDao fillDao) {
		this.fillDao = fillDao;
	}

	//教练注册信息填写
	@Override
	public boolean addInfo(Coach coach) {
		boolean re = false;
		// 随机生成昵称
		int temp = 2 + (int) (Math.random() * (7));
		String nickName = GetNickName.randomName(true, temp);

		// 从数据库中随机生成头像
		Integer hid = (int) (Math.random() * (10));
		String headImg = fillDao.findHeadImg(hid);
		
		//查询是否上传了头像
		boolean exsitHeadImg = fillDao.checkCoachHeadImg(coach);

		// 如果已经输入了昵称和账号就直接向数据库插入
		if (coach.getNickName() != null && exsitHeadImg) {
			re = fillDao.addInfo(coach);
			return re;
		} else if (exsitHeadImg && coach.getNickName()==null) {
			//如果已经上传了头像,就只随机分配一个昵称
			coach.setNickName(nickName);
			re = fillDao.addInfo(coach);
			return re;
		} else if (coach.getNickName() != null && !exsitHeadImg) {
			//如果已经输入了昵称,就只随机分配一个头像
			coach.setHeadImg(headImg);
			re = fillDao.addInfo(coach);
			return re;
		} else {
			coach.setNickName(nickName);
			coach.setHeadImg(headImg);
			re = fillDao.addInfo(coach);
			return re;
		}
	}

	@Override
	public boolean fillStudent(Student student) {
		boolean re = false;
		// 随机生成昵称
		int temp = 2 + (int) (Math.random() * (7));
		String nickName = GetNickName.randomName(true, temp);

		// 从数据库中随机生成头像
		Integer hid = (int) (Math.random() * (10));
		String headImg = fillDao.findHeadImg(hid);
		
		//查询是否上传了头像
		boolean exsitHeadImg = fillDao.checkStudentHeadImg(student);

		// 如果已经输入了昵称和账号就直接向数据库插入
		if (student.getNickName() != null && exsitHeadImg) {
			re = fillDao.fillStudent(student);
			return re;
		} else if (student.getHeadImg() == null &&exsitHeadImg) {
			//如果已经上传了头像,就只随机分配一个昵称
			student.setNickName(nickName);
			re = fillDao.fillStudent(student);
			return re;
		} else if (student.getNickName() != null && !exsitHeadImg) {
			//如果已经输入了昵称,就只随机分配一个头像
			student.setHeadImg(headImg);
			re = fillDao.fillStudent(student);
			return re;
		} else {
			student.setNickName(nickName);
			student.setHeadImg(headImg);
			re = fillDao.fillStudent(student);
			return re;
		}		
	}

	@Override
	public boolean fillGym(Gym gym) {
		boolean re = fillDao.fillGym(gym);
		return re;
	}
	
	
}
