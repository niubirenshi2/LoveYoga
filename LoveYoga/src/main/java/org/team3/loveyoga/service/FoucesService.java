package org.team3.loveyoga.service;

import java.util.List;
import java.util.Map;

import org.team3.loveyoga.pojo.Circle;
import org.team3.loveyoga.pojo.Fouces;
import org.team3.loveyoga.pojo.Friend;
import org.team3.loveyoga.pojo.User;
import org.team3.loveyoga.pojo.UserRole;

public interface FoucesService {
	//我关注的人的朋友圈信息
	List<Circle> selectMyCircle(Integer uid);
	//关注一个人
	String insertFollowOne(Integer uid,Integer fid);
	//取消关注一个人
	String deleteFollowOne(Integer uid,Integer fid);
	
	//返回关注我的人员的信息和关注表对象
	//Map<String,Object> foucesMe(Integer foucesID);
	
	//我的关注列表
	List<User> mefouceAll(Integer id);
	
	//关注我的列表
	List<User> fouceMeAll(Integer foucesID);
	
	//从列表中查询出关注人员的详细信息
	UserRole selectOneById(Integer userID);
	
	//是否将添加好友的消息发送成功
	String addFriend(Integer userID,Integer friendID);
	
	//所有邀请我成为好友的人(没有同意的)
	//List<User> showAllSendMeFriends(Integer friendID);
	
	//所有邀请我成为好友的人(没有同意的)
	List<Friend> showAllSendMeFriends(Integer friendID);
	
	//互相添加好友成功
	String becomeFriends(Integer userID,Integer friendID);
	
	//展示我的好友
	List<User> showAllMyFriends(Integer userID);
	
	//删除好友
	String deleteFriend(Integer userID,Integer friendID);
	
	//互关的情况下展示用户
	List<User> huGuan(Integer UserID);
	
	//互关情况下查看用户详细信息
	UserRole selectOneByHuGuanId(Integer id);
	
}
