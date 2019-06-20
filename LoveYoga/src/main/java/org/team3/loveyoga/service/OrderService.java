package org.team3.loveyoga.service;

import java.util.List;

import org.team3.loveyoga.pojo.Order;
import org.team3.loveyoga.pojo.Student;

public interface OrderService {
	
	List<Order> myOrders(Integer cid);
	
	List<Student> selectStudentBySid(Integer ys_id);
}
