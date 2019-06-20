package org.team3.loveyoga.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Attention;
import org.team3.loveyoga.pojo.Circle;

public interface AttentionDao {
	
	//根据登录表的uid查询关注表
	@Select("select * from y_attention where ya_uid=#{uid}")
//	@Results({
//		@Result(id=true,column="ya_id",property="ya_id"),
//		@Result(column="ya_fid",property="circles",
//		many=@Many(select="org.team3.loveyoga.Dao.CircleDao.selectMyCircle")
//				)
//	})
	List<Attention> selectMyFid(Integer uid);
	
	@Select("select * from y_circle where yc_uid=#{uid}")
	List<Circle> selectMyCircle(Integer uid);
}
