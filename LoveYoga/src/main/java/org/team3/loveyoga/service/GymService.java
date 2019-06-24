package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Gym;

public interface GymService {
	//通过uid找到场馆信息
	public Gym findGymByUid(int uid);

}
