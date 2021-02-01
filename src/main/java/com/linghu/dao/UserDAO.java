package com.linghu.dao;

import com.linghu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Mapper
public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(String id);

    List<User> findAll();

    User findById(String id);
}
