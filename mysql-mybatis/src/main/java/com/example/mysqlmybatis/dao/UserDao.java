package com.example.mysqlmybatis.dao;

import com.example.entity.User;

/**
 * @author yinghuihong
 * @date 2019/4/23
 */
public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
