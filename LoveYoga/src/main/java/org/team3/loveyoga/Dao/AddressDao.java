package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;
import org.team3.loveyoga.pojo.Coach;

public interface AddressDao {

	@Insert("insert into coach (lng,lat) values (#{lng},#{lat}) where uid=#{uid}")
	boolean setAddress(Coach coach);

}
