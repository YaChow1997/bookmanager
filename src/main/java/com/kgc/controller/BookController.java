package com.kgc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Book;
import com.kgc.pojo.Type;
import com.kgc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

/**
 * @author YaChow
 * @create 2021-03-08-9:02
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/getAllByCondition")
    public String getAllByCondition(@RequestParam(value = "book_type",required = false)Integer book_type,
                                    @RequestParam(value = "book_name",required = false)String book_name,
                                    @RequestParam(value = "is_borrow",required = false)String is_borrow,
                                    @RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
                                    Model model){
        HashMap<String,Object> hashMap = new HashMap<>();
        if (book_type != null && book_type != 0) {
            hashMap.put("bookType",book_type);
            model.addAttribute("book_type",book_type);
        }
        if (book_name != null && book_name != "") {
            hashMap.put("bookName",book_name);
            model.addAttribute("book_name",book_name);
        }
        if (is_borrow != null && is_borrow != "") {
            hashMap.put("isBorrow",is_borrow);
            model.addAttribute("is_borrow",is_borrow);
        }
        PageHelper.startPage(pageNum,5);
        List<Book> books = bookService.getByCondition(hashMap);
        PageInfo<Book> pageInfo = new PageInfo<>(books);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("books",books);
        //回显
        List<Type> types = bookService.getAllType();
        model.addAttribute("types",types);
        System.out.println("osdjfskf:,");
        System.out.println("osdjfskf:,");
        System.out.println("osdjfskf:,");
        System.out.println("osdjfskf:,");
        return "showBookInfo";
    }

    @RequestMapping("/updBook")
    public String updBook(@RequestParam("book_id")Integer book_id){
        //借阅书籍
        Integer row = bookService.borrow(book_id);
        return "redirect:/book/getAllByCondition";
    }
}
