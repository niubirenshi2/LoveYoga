package org.team3.loveyoga.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.team3.loveyoga.dao.MessageDao;
import org.team3.loveyoga.pojo.Message;
import org.team3.loveyoga.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService {
	@Resource
	private MessageDao messageDao;
	public MessageDao getMessageDao() {
		return messageDao;
	}
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	//给教练发送消息通知
	@Override
	public void sendMessageToCoach(Message message) {
		messageDao.sendMessageToCoach(message);
	}

}
