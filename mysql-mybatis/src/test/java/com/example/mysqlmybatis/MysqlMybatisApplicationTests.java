package com.example.mysqlmybatis;

import com.example.entity.User;
import com.example.mysqlmybatis.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlMybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsert() {
        int age = new Random().nextInt(10000);
        User user = new User();
        user.setUserName("yinghuihong_" + age);
        user.setPassword("123456");
        user.setAge(age);
        System.out.println("xxx " + userDao.insert(user));
    }

    @Test
    public void testQuery() {
        System.out.println("xxx " + userDao.selectByPrimaryKey(1).getUserName());
    }
}
