package com.kgc.service.impl;

import com.kgc.mapper.BookMapper;
import com.kgc.pojo.Book;
import com.kgc.pojo.Type;
import com.kgc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * @author YaChow
 * @create 2021-03-08-9:03
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List getByCondition(HashMap hashMap) {
        return bookMapper.selectByCondition(hashMap);
    }

    @Override
    public List<Type> getAllType() {
        return bookMapper.selectAllType();
    }

    @Override
    public Integer borrow(Integer book_id) {
        return bookMapper.borrow(book_id);
    }
}
