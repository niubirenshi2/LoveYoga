package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.team3.loveyoga.pojo.Coach;

@Mapper
public interface CoachDao {

	@Insert("insert into y_user (yu_name,yu_password,yu_rid) values(#{yu_name},#{yu_password},#{yu_rid})")
	boolean addCoach(Coach coach);

	@Select("select * from y_user where yu_name=#{account} and flag=0")
	Integer findCoachById(String account);

	@Select("select yu_id from y_user where yu_name=#{name} and flag=0")
	Integer findIdByName(String name);

	@Update("update y_user set flag=1 where yu_id=#{id}")
	void setFlag(Integer id);


}