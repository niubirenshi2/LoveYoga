package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Student;

public interface UploadService {

	boolean uploadStudentImg(Student student);

	boolean uploadCoachImg(Coach coach);

}
