package com.gongml.demo.mybatis.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gongml.demo.mybatis.entity.User;
import com.gongml.demo.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: Gongml
 * @create: 2018-12-21 14:21
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryPage")
    public List<User> getUserByPage(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
        if (page == null) {
            page = 1;
        }
        if (size == null) {
            size = 10;
        }
        Page<User> page1 = new Page<User>(page, size);
        IPage<User> userEntityIPage = userMapper.selectPage(page1, new QueryWrapper<User>());
        List<User> records = userEntityIPage.getRecords();
        return records;
    }


    @RequestMapping("/{id}")
    public User selectAll(@PathVariable("id") Integer id) {
        User user = userMapper.selectById(1);
        return user;
    }
}
