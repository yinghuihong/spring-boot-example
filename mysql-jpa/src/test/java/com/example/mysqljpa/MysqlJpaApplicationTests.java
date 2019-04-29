package com.example.mysqljpa;

import com.example.mysqljpa.entity.User;
import com.example.mysqljpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MysqlJpaApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("yinghuihong");
        user.setEmail("123997654@qq.com");
        System.out.println("xxx " + userRepository.save(user));
    }

    @Test
    public void testFindAll() {
        System.out.println("xxx " + userRepository.findAll());
    }

}
