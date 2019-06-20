package org.team3.loveyoga.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Order;
import org.team3.loveyoga.pojo.Student;

public interface OrderDao {
	//查询所有的订单项
	@Select("select * from y_order where yo_cid=#{yo_cid}")
	List<Order> selectAllOrders(Integer yo_cid);
	
	//根据订单中的学生id到学生表中查询出学生信息
	@Select("select * from y_student")
	List<Student> selectStudentsAll();
}
