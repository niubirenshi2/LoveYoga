package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Message;

public interface MessageService {

	//给教练发送消息通知
	public void sendMessageToCoach(Message message);
}
