package com.kgc.mapper;

import com.kgc.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author YaChow
 * @create 2021-03-08-9:29
 */
public interface UserMapper {
    Integer selectByCodeAndPwd(@Param("user_code")String user_code,
                               @Param("password")String password);
    Integer insertUser(User user);


}
