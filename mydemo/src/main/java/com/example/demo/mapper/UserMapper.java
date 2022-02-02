package com.example.demo.mapper;

import java.util.Collection;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Entity com.example.demo.domain.User
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectByName(@Param("name") String name);

    List<User> selectByNameLike(@Param("name") String name);

    List<User> selectByAgeEquals(Integer age);

    int insertSelective(User user);

    List<User> selectByNameAndAge(@Param("name") String name, @Param("age") Integer age);

    int insertBatch(@Param("userCollection") Collection<User> userCollection);

}
