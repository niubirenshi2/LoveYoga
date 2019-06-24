package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Gym;

public interface GymDao {
	//通过uid找到场馆信息
	@Select("select * from gym where uid=#{uid}")
	public Gym findGymByUid(int uid);
}