package com.jkxy.car.api.dao;

import com.jkxy.car.api.pojo.CarStorage;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CarStorageDao {

    @Select("select carAmount from carStorage where id = #{id}")
    int findCarAmount(int id);

    @Update("update carStorage set carAmount = carAmount-1 where id = #{id}")
    void decreaseCarAmount(int id);

    @Insert("insert into carStorage values(#{id},#{carAmount})")
    void initCarAmount(CarStorage carStorage);

    @Update("update carStorage set carAmount = #{carAmount} where id = #{id}")
    void updateCarAmount(CarStorage carStorage);
}
