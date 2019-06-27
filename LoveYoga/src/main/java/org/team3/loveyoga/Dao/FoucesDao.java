package org.team3.loveyoga.Dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.team3.loveyoga.pojo.Circle;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Fouces;
import org.team3.loveyoga.pojo.Friend;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;
import org.team3.loveyoga.pojo.User;
import org.team3.loveyoga.pojo.UserRole;

public interface FoucesDao {
	/*
	 * 根据id查询出关注列表，根据关注列表中的关注人id查询出他的朋友圈
	 */
	//根据登录表的uid查询关注表
	@Select("SELECT * from circle WHERE userID in(SELECT foucesID FROM fouces where userID=#{uid} and flag=0)")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="userID",property="user",
		one=@One(select="org.team3.loveyoga.Dao.FoucesDao.userById")
				)
	})
	List<Circle> selectMyCircle(Integer uid);
	
	@Select("select * from user where id=#{id}")
	User userById(Integer id);
	
	//关注之后将关注信息加入数据库
	@Insert("insert into fouces(userID,foucesID,createTime) values (#{uid},#{fid},#{createtime})")
	int insertFollowOne(@Param("uid")Integer uid,@Param("fid")Integer fid,@Param("createtime")Date createtime);
	
	//查看关注表里面是否有该用户，如果有则已经关注过了
	@Select("SELECT foucesID FROM fouces WHERE foucesID=#{fid} AND userID=#{uid} AND flag=0")
	Integer selectAttentionByUidAndFid(@Param("uid")Integer uid,@Param("fid")Integer fid);
	
	//删除关注表中的用户:软删除
	@Delete("update fouces set flag=1,deleteTime=#{deletetime} where foucesID=#{fid} AND userID=#{uid}")
	Integer deleteFollowOne(@Param("uid")Integer uid,@Param("fid")Integer fid,@Param("deletetime")Date deletetime);
	
	//显示所有关注的人员信息
	/*
	 * 根据场馆id查询出关注场馆的人员，根据人员id查询出关注用户权限对象
	 */
//	@Select("SELECT * from userrole WHERE userID in(SELECT userID FROM fouces WHERE foucesId=#{foucesID} and flag=0)")
//	List<UserRole> foucesMe(Integer foucesID);
	
	//能查看默认全部公开人的详细信息
	@Select("select * from student where userID=#{userID} and state=2")
	Student foucesMeByStudent(Integer userID);
	//能查看默认全部公开人的详细信息
	@Select("select * from coach where uid=#{userID} and telvisible=0")
	Coach foucesMeByCoach(Integer userID);
	
	@Select("select * from gym where  uid=#{userID}")
	Gym foucesMeByGym(Integer userID);
	
	
	//根据ID查出我关注的人员的user
	@Select("SELECT * from user WHERE id in(SELECT foucesID FROM fouces WHERE userID=#{userID} and flag=0)")
	List<User> mefouceAll(Integer userID);
	
	//根据foucesID查出关注我的人员user
	@Select("SELECT * from user WHERE id in(SELECT userID FROM fouces WHERE foucesID=#{foucesID} and flag=0)")
	List<User> fouceMeAll(Integer foucesID);
	
	//根据前端发送过来的关注id查询该客户的详细的消息
	@Select("SELECT * from userrole where userID=#{id}")
	@Results({
	@Result(id=true,column="id",property="id"),
	@Result(column="userID",property="student",
	one=@One(select="org.team3.loveyoga.Dao.FoucesDao.foucesMeByStudent")),
	@Result(column="userID",property="coach",
	one=@One(select="org.team3.loveyoga.Dao.FoucesDao.foucesMeByCoach")),
	@Result(column="userID",property="gym",
	one=@One(select="org.team3.loveyoga.Dao.FoucesDao.foucesMeByGym"))
})
	UserRole selectOneById(Integer id);
	
	//好友关系前提为互相关注
	//根据count是否为0判断是否互相关注
	@Select("SELECT COUNT(userID) FROM fouces WHERE userID=#{userID} AND flag=0 AND foucesID=#{foucesID} HAVING COUNT(userID)=(SELECT COUNT(*) FROM fouces WHERE userID=#{foucesID} AND flag=0 AND foucesID=#{userID})")
	Integer mutualConcern(@Param("userID")Integer userID,@Param("foucesID")Integer foucesID);
	
	//发送添加好友的信息
	@Insert("insert into friend(userID,friendID,createTime) values(#{userID},#{friendID},#{createtime})")
	Integer addFriend(@Param("userID")Integer userID,@Param("friendID")Integer friendID,@Param("createtime")Date createtime);
	
	//判断该账号是否已经给同一人发送过添加信息
	@Select("select * from friend where userID=#{userID} and friendID=#{friendID}")
	Friend selectAddFriendByUserIDAndFriendID(@Param("userID")Integer userID,@Param("friendID")Integer friendID);
	
	//更新邀请添加好友的时间
	@Update("update friend set createTime=#{createtime} where userID=#{userID} and friendID=#{friendID}")
	Integer updateCreateTimeByUserIDAndFriendID(@Param("userID")Integer userID,@Param("friendID")Integer friendID,@Param("createtime")Date createtime);
	
	
	//展示添加给我发送好友邀请的人(暂时没有同意的)
//	@Select("SELECT * FROM `user` WHERE id in(SELECT userID FROM friend WHERE friendID=#{friendID} AND state=0 and flag=0)")
//	List<User> showAllSendMeFriends(Integer friendID);
	
	//邀请人姓名
	@Select("SELECT * FROM friend WHERE friendID=#{friendID} AND state=0 and flag=0")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="userID",property="name",
		one=@One(select="org.team3.loveyoga.Dao.FoucesDao.userById")
				)
	})
	List<Friend> showAllSendMeFriends(Integer friendID);
	
	//同意好友邀请
	@Insert("insert into friend(userID,friendID,createTime,state) values(#{userID},#{friendID},#{createtime},1)")
	Integer agreeFriend(@Param("userID")Integer userID,@Param("friendID")Integer friendID,@Param("createtime")Date createtime);
	
	//同意了之后更新邀请人状态
	@Update("update friend set state=1 where userID=#{friendID} and friendID=#{userID}")
	Integer updateInviterState(@Param("userID")Integer userID,@Param("friendID")Integer friendID);
	
	//我的好友列表
	@Select("SELECT * FROM `user` WHERE id in(SELECT friendID FROM friend WHERE userID=#{userID} AND state=1 and flag=0)")
	List<User> showAllMyFriends(Integer userID);
	
	//删除好友
	@Delete("DELETE FROM friend WHERE userID=#{userID} AND friendID=#{friendID}")
	int deleteMyFriendByUserID(@Param("userID")Integer userID,@Param("friendID")Integer friendID);
	@Delete("DELETE FROM friend WHERE userID=#{friendID} AND friendID=#{userID}")
	int deleteMyFriendByFriendID(@Param("userID")Integer userID,@Param("friendID")Integer friendID);
	
	//已互关表user
	@Select("SELECT * FROM user WHERE id IN(SELECT userID FROM fouces WHERE userID in (SELECT foucesID FROM fouces WHERE userID=#{UserID} AND flag=0) AND foucesID=#{userID})")
	List<User> huGuan(Integer UserID);
	
	
	/**
	 * 互关情况下查看详细信息
	 * @param userID
	 * @return
	 */
	//能查看默认好友公开人的详细信息
	@Select("select * from student where userID=#{userID} and state in(1,2)")
	Student selectStudent(Integer userID);
	//能查看默认好友公开人的详细信息
	@Select("select * from coach where uid=#{userID} and telvisible in(0,1)")
	Coach selectCoach(Integer userID);
	//在互关关系下查看具体信息
	@Select("SELECT * from userrole where userID=#{id}")
	@Results({
	@Result(id=true,column="id",property="id"),
	@Result(column="userID",property="student",
	one=@One(select="org.team3.loveyoga.Dao.FoucesDao.selectStudent")),
	@Result(column="userID",property="coach",
	one=@One(select="org.team3.loveyoga.Dao.FoucesDao.selectCoach")),
	@Result(column="userID",property="gym",
	one=@One(select="org.team3.loveyoga.Dao.FoucesDao.foucesMeByGym"))
})
	UserRole selectOneByHuGuanId(Integer id);
	
	//回家再想想
		
}
