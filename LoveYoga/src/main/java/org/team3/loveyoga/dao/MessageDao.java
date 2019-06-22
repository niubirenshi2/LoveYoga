package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.team3.loveyoga.pojo.Message;

public interface MessageDao {
	//学员给教练发消息通知
	@Insert("insert into message(studentID,coachID,form,createTime,state) values(#{studentID},#{coachID},#{form},#{createTime},0)")
	public void sendMessageToCoach(Message message);
	
	//教练给学员发送消息通知
	@Insert("insert into message(studentID,coachID,form,createTime,state) values(#{studentID},#{coachID},#{form},#{createTime},1)")
	public void sendMessageToStudent(Message message);
	
	/*//教练给场馆发送消息通知
	@Insert("insert into message(coachId,form,createTime,state)")
	public void sendMessageToGym(Message message);*/
	
}