package org.team3.loveyoga.service;

import org.team3.loveyoga.pojo.Coach;
import org.team3.loveyoga.pojo.Gym;
import org.team3.loveyoga.pojo.Student;

public interface FillService {

	boolean addInfo(Coach coach);

	boolean fillStudent(Student student);

	boolean fillGym(Gym gym);

}
