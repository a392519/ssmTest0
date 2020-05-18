package com.mhys.mapper;

import com.mhys.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> findAll(User user);
    int add(User user);
    User findById(User user);
    int updateById(User user);
}
