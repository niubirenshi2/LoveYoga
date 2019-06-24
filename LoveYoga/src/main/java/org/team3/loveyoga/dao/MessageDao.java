package org.team3.loveyoga.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.team3.loveyoga.pojo.Message;

public interface MessageDao {
	//学员给教练发消息通知（state=0）
	@Insert("insert into message(studentID,coachID,form,createTime,state) values(#{studentID},#{coachID},#{form},#{createTime},0)")
	public void sendMessageToCoach(Message message);
	
	//教练给学员发送消息通知（state=1）
	@Insert("insert into message(studentID,coachID,form,createTime,state) values(#{studentID},#{coachID},#{form},#{createTime},1)")
	public void sendMessageToStudent(Message message);
	
	//教练给场馆发送消息通知（state=2）
	@Insert("insert into message(coachId,gymID,form,createTime,state) values(#{coachID},#{gymID},#{form},#{createTime},2)")
	public void sendMessageToGym(Message message);
	
	//场馆给教练发送消息（state=3）
	@Insert("insert into message(coachId,gymID,form,createTime,state) values(#{coachID},#{gymID},#{form},#{createTime},3)")
	public void sendMessagyToCoachByGym(Message message);
	
	//学员查看收到的消息
	@Select("select * from message where studentID=#{studentID} and state=1 and flag=0")
	public List<Message> showStudentMessage(int studentID);
	
	//教练查看消息
	@Select("select * from message where coachID=#{coachID} and flag=0 and state=0 or state=3")
	public List<Message> showCoachMessage(int coachID);
	
	//场馆查看消息
	@Select("select * from message where gymID=#{gymID} and state=2 and flag=0")
	public List<Message> showGymMessage(int gymID);
	
	//以id查询一条消息
	@Select("select * from message where id=#{id}")
	public Message findMessageById(int id);
	
	//以id删除消息
	@Update("update message set flag=1 where id=#{id}")
	public void deleteMessageById(int id);
}