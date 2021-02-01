package com.linghu.controller;

import com.linghu.entity.User;
import com.linghu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    /*
    * 查询所有开发
    * */
    @GetMapping("findAll")
    public Map<String,Object> findAll(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<>();
        List<User> results = userService.findAll();
        map.put("total",10);
        map.put("totalpage",1);
        map.put("page",page);
        map.put("results",results);
        return map;
    }
}
