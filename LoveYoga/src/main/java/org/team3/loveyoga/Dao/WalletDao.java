package org.team3.loveyoga.Dao;

import org.team3.loveyoga.pojo.Wallet;

public interface WalletDao {
    int insert(Wallet record);

    int insertSelective(Wallet record);
}