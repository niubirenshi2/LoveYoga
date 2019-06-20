package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.team3.loveyoga.pojo.CoachInfo;

@Mapper
public interface CoachInfoDao {

	@Insert("insert into y_coach ")
	boolean addInfo(CoachInfo coachInfo);

	@Insert("insert into y_coach (yc_uid) values (#{id})")
	boolean addUid(Integer id);


}