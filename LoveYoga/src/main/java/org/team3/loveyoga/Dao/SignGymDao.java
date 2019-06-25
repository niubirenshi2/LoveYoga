package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.team3.loveyoga.pojo.SignGym;

public interface SignGymDao {
	
	//教练给场馆发送签约申请
	@Insert("insert into signgym(coachID,gymID) values(#{coachID},#{gymID})")
	public void sendRequestToGym(SignGym signGym);
	
	//场馆同意教练签约申请(flag=1)/教练同意场馆申请
	@Update("update signgym set flag=1 where gymID=#{gymID} and coachID=#{coachID} and flag=0")
	public void acceptCoachSign(SignGym signGym);
	//场馆拒绝教练签约申请(flag=2)/教练同意场馆申请
	@Update("update signgym set flag=2 where gymID=#{gymID} and coachID=#{coachID} and flag=0")
	public void refuseCoachSign(SignGym signGym);
	
	//查询是否发送申请
	@Select("select * from signgym where coachID=#{coachID} and gymID=#{gymID} and flag=0")
	public SignGym findRequest(SignGym signGym);
	
	//查询是否签约
	@Select("select * from signgym where coachID=#{coachID} and gymID=#{gymID} and flag=1")
	public SignGym findSign(SignGym signGym);
	
}