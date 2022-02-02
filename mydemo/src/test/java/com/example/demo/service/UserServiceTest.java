package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.domain.User;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest @Slf4j public class UserServiceTest {

    @Resource private UserService userService;

    @Test void saveBatch() {
        List<User> userList = new ArrayList<>();
        userList.add(buildUserA("A1"));
        userList.add(buildUserB("B1"));
        userList.add(buildUserA("A2"));
        userList.add(buildUserA("A3"));
        userList.add(buildUserA("A4"));
        userList.add(buildUserB("B2"));
        userService.saveBatch(userList);
    }

    private User buildUserA(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(0);
        user.setSex(0);
        user.setSchoolName("");
        user.setGmt_create(LocalDateTime.now());
        return user;
    }

    private User buildUserB(String name) {
        User user = new User();
        user.setName(name);
        user.setEmail("");
        user.setSex(0);
        user.setSchoolName("");
        user.setGmt_create(LocalDateTime.now());
        return user;
    }

}
