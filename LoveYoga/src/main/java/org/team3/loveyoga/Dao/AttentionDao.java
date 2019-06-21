package org.team3.loveyoga.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
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
	@Select("SELECT * from y_circle WHERE yc_uid in(SELECT ya_fid FROM y_attention where ya_uid=#{uid})")
//	@Results({
//		@Result(id=true,column="ya_id",property="ya_id"),
//		@Result(column="ya_fid",property="circles",
//		many=@Many(select="org.team3.loveyoga.Dao.CircleDao.selectMyCircle")
//				)
//	})
	List<Circle> selectMyCircle(Integer uid);

}
