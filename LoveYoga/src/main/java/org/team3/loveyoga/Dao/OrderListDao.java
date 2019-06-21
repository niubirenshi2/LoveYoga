package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.OrderList;

public interface OrderListDao {
    int insert(OrderList record);

    int insertSelective(OrderList record);
}