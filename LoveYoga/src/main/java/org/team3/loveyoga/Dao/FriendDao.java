package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;
import org.team3.loveyoga.pojo.Friend;

public interface FriendDao {
	//教练同意学员签约，双方成为好友
	@Insert("insert into friend(userID,friendID,createTime,state) values(#{userID},#{friendID},#{createTime},1)")
	public void makeFriendWithStudent(Friend friend);
	@Insert("insert into friend(userID,friendID,createTime,state) values(#{userID},#{friendID},#{createTime},1)")
	public void makeFriendWhthCoach(Friend friend);
}