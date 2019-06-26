package org.team3.loveyoga.Dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UploadDao {

	/**
	 * 设置学生的头像
	 * @param newFilePath
	 * @param uid
	 * @return
	 */
	@Update("update student set headImg=#{newFilePath} where uid = #{uid} and flag=0")
	boolean uploadCoachImg(@Param("newFilePath") String newFilePath,@Param("uid") Integer uid);

	/**
	 * 设置教练的头像
	 * @param newFilePath
	 * @param uid
	 * @return
	 */
	@Update("update coach set headImg=#{newFilePath} where uid = #{uid} and flag=0")
	boolean uploadStudentImg(@Param("newFilePath") String newFilePath,@Param("uid") Integer uid);
	
	/**
	 * 插入场馆的图片
	 * @param newFilePath
	 * @param uid
	 * @return
	 */
	@Insert("insert into gymPhoto (img) values (#{newFilePath}) where uid = #{uid}")
	Integer uploadGymPhotos(@Param("newFilesPath") String newFilePath,@Param("uid") Integer uid);

}
