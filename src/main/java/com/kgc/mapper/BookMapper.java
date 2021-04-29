package com.kgc.mapper;

import com.kgc.pojo.Book;
import com.kgc.pojo.Type;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author YaChow
 * @create 2021-03-08-9:00
 */
public interface BookMapper {
    List selectByCondition(HashMap hashMap);
    List<Type> selectAllType();
    Integer borrow(Integer book_id);
}
