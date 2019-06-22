package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Message;

public interface MessageService {

	//学员给教练发送消息通知
	public void sendMessageToCoach(Message message);
	
	//教练给学员发送消息通知
	public void sendMessageToStudent(Message message);
	
	/*//教练给场馆发送消息通知
	public void sendMessageToGym(Message message);*/
}
