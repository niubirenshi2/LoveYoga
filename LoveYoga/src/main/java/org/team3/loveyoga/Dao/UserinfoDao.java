package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;

public interface UserinfoDao {

	/**
	 * 查询教练提交的信息
	 * @param uid
	 * @return
	 */
	@Select("select * from coach where uid=#{uid} and flag=0")
	Coach findCoachInfo(Integer uid);

	/**
	 * 查询学员提交的信息
	 * @param uid
	 * @return
	 */
	@Select("select * from student where uid=#{uid} and flag=0")
	Student findStudentInfo(Integer uid);

	/**
	 * 查询场馆注册的信息
	 * @param uid
	 * @return
	 */
	@Select("select * from gym where uid=#{uid} and flag=0")
	Gym findGymInfo(Integer uid);
}
