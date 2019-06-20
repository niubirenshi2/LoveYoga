package org.team3.loveyoga.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.CoachInfo;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Nickname;
import org.team3.loveyoga.pojo.Sign_gym;
import org.team3.loveyoga.provider.GymProvider;

public interface GymaDao {
	//将信息完善的内容添加到场馆表y_gym
	//update
	@UpdateProvider(type=GymProvider.class,method="updateGym")
	public int updateGym(Gym gym);
	@Insert("INSERT INTO y_coach VALUES(ycc_cid=#{ycc_cid},ycc_gcid=#{ycc_gcid})")
	public int insertByCidAndgcid(@Param("ycc_cid")Integer cid,@Param("ycc_gcid")Integer gcid);
	@Select("SELECT * FROM y_coach WHERE yc_telphone=#{yc_telphone}")
	public CoachInfo selectCoachIdByPhone(String yc_telphone);
	@Select("SELECT * FROM y_sign_gym WHERE coachId=#{coachId}")
	public Sign_gym SelectSignGymId(Integer coachId);
	@Select("SELECT * FROM y_nickname WHERE yc_nicknameid=#{yc_nicknameid}")
	public Nickname selectNicknameByNicknameId(Integer yc_nicknameid);
	
}
