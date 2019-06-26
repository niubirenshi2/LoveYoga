package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;

public interface UserInfoService {

	Coach findCoachInfo(Integer uid);

	Student findStudentInfo(Integer uid);

	Gym findGymInfo(Integer uid);

}
