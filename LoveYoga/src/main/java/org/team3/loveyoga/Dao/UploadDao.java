package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;

public interface UploadDao {

	@Insert("insert into student (headImg) values (#{newFilePath}) where uid = (#{uid})")
	boolean uploadCoachImg(String newFilePath, Integer uid);

	@Insert("insert into coach (headImg) values (#{newFilePath}) where uid = (#{uid})")
	boolean uploadStudentImg(String newFilePath, Integer uid);

}
