package org.team3.loveyoga.Dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Attention;
import org.team3.loveyoga.pojo.Circle;

public interface AttentionDao {
	/*
	 * 根据id查询出关注列表，根据关注列表中的关注人id查询出他的朋友圈
	 */
	//根据登录表的uid查询关注表
	@Select("SELECT * from y_circle WHERE yc_uid in(SELECT ya_fid FROM y_attention where ya_uid=#{uid} and flag=0)")
//	@Results({
//		@Result(id=true,column="ya_id",property="ya_id"),
//		@Result(column="ya_fid",property="circles",
//		many=@Many(select="org.team3.loveyoga.Dao.CircleDao.selectMyCircle")
//				)
//	})
	List<Circle> selectMyCircle(Integer uid);
	
	//关注之后将关注信息加入数据库
	@Insert("insert into y_attention(ya_uid,ya_fid,ya_createtime) values (#{uid},#{fid},#{createtime})")
	int insertFollowOne(@Param("uid")Integer uid,@Param("fid")Integer fid,@Param("createtime")Date createtime);
	
	//查看关注表里面是否有该用户，如果有则已经关注过了
	@Select("SELECT ya_fid FROM y_attention WHERE ya_fid=#{fid} AND ya_uid=#{uid} AND flag=0")
	Integer selectAttentionByUidAndFid(@Param("uid")Integer uid,@Param("fid")Integer fid);
	
	//删除关注表中的用户:软删除
	@Delete("update y_attention set flag=1,ya_deletetime=#{deletetime} where ya_fid=#{fid} AND ya_uid=#{uid}")
	Integer deleteFollowOne(@Param("uid")Integer uid,@Param("fid")Integer fid,@Param("deletetime")Date deletetime);
	
	
}
