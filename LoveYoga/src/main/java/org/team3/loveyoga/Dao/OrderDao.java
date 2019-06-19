package org.team3.loveyoga.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.team3.loveyoga.pojo.Order;

public interface OrderDao {
	
	@Select("select * from y_order where cid=#{cid}")
	List<Order> myOrders(Integer cid);
	
	@select("select ys_name from ")
	String selectStudentBySid(Integer sid);
}
