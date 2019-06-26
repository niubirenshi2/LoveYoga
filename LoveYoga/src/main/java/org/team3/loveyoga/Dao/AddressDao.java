package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface AddressDao {

	@Update("update coach set lng=#{lng},lat=#{lat} ) where uid=#{uid} and flag=0")
	boolean setCoachAddress(@Param("uid") Integer uid,@Param("pointX") Double pointX,@Param("pointY") Double pointY);

	@Update("update gym set lng=#{lng},lat=#{lat} ) where uid=#{uid} and flag=0")
	boolean setGymAddress(@Param("uid") Integer uid,@Param("pointX") Double pointX,@Param("pointY") Double pointY);

}
