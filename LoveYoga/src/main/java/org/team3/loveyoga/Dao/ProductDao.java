package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Product;

public interface ProductDao {
    int insert(Product record);

    int insertSelective(Product record);
}