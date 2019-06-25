package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Coach;

public interface CoachDao {
	//通过UID查询教练信息
	@Select("select * from coach where uid=#{uid}")
	public Coach findCoachByUid(int uid);
}