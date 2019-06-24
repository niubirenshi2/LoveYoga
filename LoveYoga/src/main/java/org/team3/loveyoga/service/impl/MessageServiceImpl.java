package org.team3.loveyoga.service.impl;

import java.util.List;

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
	//教练给学员发送消息
	@Override
	public void sendMessageToStudent(Message message) {
		messageDao.sendMessageToStudent(message);
	}
	//教练给场馆发消息
	@Override
	public void sendMessageToGym(Message message) {
		messageDao.sendMessageToGym(message);
	}
	
	//学员查看教练发送的消息
	@Override
	public List<Message> showStudentMessage(int studentID) {
		return messageDao.showStudentMessage(studentID);
	}
	@Override
	public List<Message> showCoachMessage(int coachID) {
		return messageDao.showCoachMessage(coachID);
	}
	@Override
	public List<Message> showGymMessage(int gymID) {
		return messageDao.showGymMessage(gymID);
	}
	@Override
	public void sendMessagyToCoachByGym(Message message) {
		messageDao.sendMessagyToCoachByGym(message);
	}
	@Override
	public Message findMessageById(int id) {
		// TODO Auto-generated method stub
		return messageDao.findMessageById(id);
	}
	@Override
	public void deleteMessageById(int id) {
		messageDao.deleteMessageById(id);
	}

}
