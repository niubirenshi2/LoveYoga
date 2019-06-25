package org.team3.loveyoga.Dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UploadDao {

	@Insert("insert into student (headImg) values (#{newFilePath}) where uid = (#{uid})")
	boolean uploadCoachImg(@Param("newFilePath") String newFilePath,@Param("uid") Integer uid);

	@Insert("insert into coach (headImg) values (#{newFilePath}) where uid = (#{uid})")
	boolean uploadStudentImg(@Param("newFilePath") String newFilePath,@Param("uid") Integer uid);
	
	@Insert("insert into gymPhoto (img) values (#{newFilePath}) where uid = (#{uid})")
	Integer uploadGymPhotos(@Param("newFilesPath") String newFilePath,@Param("uid") Integer uid);

}
