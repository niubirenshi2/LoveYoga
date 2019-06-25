package org.team3.loveyoga.service;

import java.util.List;

import org.team3.loveyoga.pojo.Message;

public interface MessageService {

	//学员给教练发申请通知--教练要操作的的（state=0）
	public void sendMessageToCoach(Message message);
	
	//教练同意/拒绝学员的申请，发送的通知--学员要查看的（state=1）
	public void sendMessageToStudent(Message message);
	
	//教练给场馆发送申请--场馆要操作的（state=2）
	public void sendMessageToGym(Message message);
	
	//场馆给教练发送申请消息---教练要操作的（state=3）
	public void sendMessagyToCoachByGym(Message message);
	
	//教练拒绝/同意场馆发送的消息--场馆要查看的（state=4）
	public void sendMessagyToGymBycoach(Message message);
	
	//场馆拒绝/同意教练发送的消息--教练要查看的（state=5）
	public void sendMessagyToCoachByGym2(Message message);
	
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
