package org.team3.loveyoga.service;

import java.util.List;

import org.team3.loveyoga.pojo.Order;
import org.team3.loveyoga.pojo.Student;

public interface OrderService {
	
	List<Order> myOrders(Integer yo_cid);
//	List<Student> selectStudentAll();
}
