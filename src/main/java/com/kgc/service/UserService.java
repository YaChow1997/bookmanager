package com.kgc.service;

import com.kgc.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author YaChow
 * @create 2021-03-08-9:48
 */
public interface UserService {
    Integer getByCodeAndPwd(String user_code,String password);
    Integer addUser(User user);

}
