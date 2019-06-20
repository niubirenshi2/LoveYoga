package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Nickname;

public interface NicknameDao {
    int insert(Nickname record);

	int insertSelective(Nickname record);


}