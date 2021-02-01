package com.linghu.service;

import com.linghu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    void save(User user);
    void update(User user);
    void delete(String id);

    List<User> findAll();

    User findById(String id);
}
