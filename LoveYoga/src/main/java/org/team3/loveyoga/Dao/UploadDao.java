package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Student;

public interface UploadDao {

	boolean uploadStudentImg(Student student);

	boolean uploadCoachImg(Coach coach);

}
