package org.team3.loveyoga.Dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;

public interface FillDao {
	  @Insert("insert into coach (authorty,headImg,nickName,address,price,freetime,acceptState,genre,telvisible,telphone,courseState,persoalTrainer,expectedSalary,qq) "
	    		+ "values (#{authorty},#{headImg},#{nickName},#{address},#{price},#{freetime},#{acceptState},#{genre},#telvisible{telphone},#{courseState},#{persoalTrainer},#{expectedSalary},#{qq}) "
	    		+ "where uid = #{uid}")
		boolean addInfo(Coach coach);

	    @Select("select headImg from headImg where headImgId=#{hid} and flag =0")
		String findHeadImg(Integer hid);
	    
	    
	    @Insert("insert into student (headImg,nickName,address,creatTime,state) "
	    		+ "values (#{headImg},#{nickName},#{address},#{creatTime}，#{state}) "
	    		+ "where uid = #{uid}")
		boolean fillStudent(Student student);
	    @Insert("insert into Gym (telphone,gymName,address) "
	    		+ "values (#{telphone},#{gymName},#{address}) "
	    		+ "where uid = #{uid}")    
		boolean fillGym(Gym gym);

	    @Select("selcet headImg from coach where uid=#{uid}")
		boolean checkCoachHeadImg(Coach coach);
	     
	    @Select("selcet headImg from student where userID=#{userID}")
		boolean checkStudentHeadImg(Student student);
}
