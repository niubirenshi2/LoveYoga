package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.team3.loveyoga.pojo.SignGym;

public interface SignGymDao {
	
	//教练给场馆发送签约申请
	@Insert("insert into signgym(coachID,gymID) values(#{coachID},#{gymID})")
	public void sendRequestToGym(SignGym signGym);
	
	//场馆同意教练签约申请
	@Update("update signgym set flag=1 where gymID=#{gymID} and coachID=#{coachID} and flag=0")
	public void acceptCoachSign(SignGym signGym);
}