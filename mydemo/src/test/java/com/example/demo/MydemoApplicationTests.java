package com.example.demo;

import java.time.LocalDateTime;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
class MydemoApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void selectByNameLike() {
        List<User> userList = userMapper.selectByNameLike("1");
        log.info("{}", userList);
    }

    @Test
    void selectByName() {
        List<User> userList = userMapper.selectByName("1");
        log.info("{}", userList);
    }

    @Test
    void selectByNameAndAge() {
        List<User> userList = userMapper.selectByNameAndAge("1", 3);
        log.info("{}", userList);
    }

    @Test
    void insertSelective() {
        User user = new User();
        user.setName("");
        user.setEmail("");
        user.setAge(0);
        user.setSex(0);
        user.setSchoolName("");
        user.setGmt_create(LocalDateTime.now());

        userMapper.insertSelective(user);
        log.info("{}", user);
    }

}
