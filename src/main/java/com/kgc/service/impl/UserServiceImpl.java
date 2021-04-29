package com.kgc.service.impl;

import com.kgc.mapper.UserMapper;
import com.kgc.pojo.User;
import com.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YaChow
 * @create 2021-03-08-9:49
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer getByCodeAndPwd(String user_code, String password) {
        return userMapper.selectByCodeAndPwd(user_code,password);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insertUser(user);
    }
}
