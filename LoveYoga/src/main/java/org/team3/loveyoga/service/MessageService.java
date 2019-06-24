package org.team3.loveyoga.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.team3.loveyoga.pojo.Message;

public interface MessageService {

	//学员给教练发送消息通知
	public void sendMessageToCoach(Message message);
	
	//教练给学员发送消息通知
	public void sendMessageToStudent(Message message);
	
	//教练给场馆发送消息通知
	public void sendMessageToGym(Message message);
	
	//场馆给教练发送消息（state=3）
	public void sendMessagyToCoachByGym(Message message);
	
	//学员查看收到的消息
	public List<Message> showStudentMessage(int studentID);
	
	//教练查看收到的消息
	public List<Message> showCoachMessage(int coachID);
	
	//场馆查看收到的消息
	public List<Message> showGymMessage(int gymID);
	
	//以id查询一条消息
	public Message findMessageById(int id);
	
	//以id删除消息
	public void deleteMessageById(int id);
}
