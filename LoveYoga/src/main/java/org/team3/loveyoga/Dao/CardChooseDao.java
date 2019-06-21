package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.CardChoose;

public interface CardChooseDao {
    int insert(CardChoose record);

    int insertSelective(CardChoose record);
}