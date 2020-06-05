package com.example.demo.dao;

import com.example.demo.entity.TestUser;

public interface TestUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    String selectSelective(TestUser record);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}