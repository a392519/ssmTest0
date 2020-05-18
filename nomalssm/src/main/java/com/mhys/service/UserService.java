package com.mhys.service;

import com.mhys.mapper.UserMapper;
import com.mhys.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> findAll(User user){
        return userMapper.findAll(user);
    }

    public int add(User user){
        return userMapper.add(user);
    }
    public  User findById(User user){
        return userMapper.findById(user);
    }
    public int updateById(User user){
        return userMapper.updateById(user);
    }
}
