package org.team3.loveyoga.dao;

import org.apache.ibatis.annotations.Insert;
import org.team3.loveyoga.pojo.Message;

public interface MessageDao {
	//给教练发消息通知
	@Insert("insert into message(studentID,coachID,form,createTime) values(#{studentID},#{coachID},#{form},#{createTime})")
	public void sendMessageToCoach(Message message);
}