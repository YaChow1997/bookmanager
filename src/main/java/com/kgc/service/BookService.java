package com.kgc.service;

import com.kgc.pojo.Book;
import com.kgc.pojo.Type;

import java.util.HashMap;
import java.util.List;

/**
 * @author YaChow
 * @create 2021-03-08-9:01
 */
public interface BookService {
    List getByCondition(HashMap hashMap);
    List<Type> getAllType();
    Integer borrow(Integer book_id);
}
