package com.guangc.library.library.web.controller;

import com.guangc.library.library.bean.Book;
import com.guangc.library.library.service.IBookService;
import com.guangc.library.library.service.Impl.BookServiceImpl;
import com.guangc.library.library.service.Impl.LeaseServiceImpl;
import com.guangc.library.library.utils.Message;
import com.guangc.library.library.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangcheng
 * @date 2019/5/16 16:25
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("findAllBook")
    public Message  findAllBook(){
        return MessageUtil.success(bookService.findAllBook());
    }

    @GetMapping("findBookById")
    public Message  findBookById(Integer id){
        if(id==null){
            return MessageUtil.success(bookService.findAllBook());
        }
        return MessageUtil.success(bookService.findBookById(id));
    }
    @GetMapping("findBookByType")
    public Message  findBookByType(String type){
        return MessageUtil.success(bookService.findBookByType(type));
    }
    @GetMapping("findBookByBookName")
    public Message  findBookByBookName(String bookname){
        return MessageUtil.success(bookService.findBookByBookName(bookname));
    }
    @GetMapping("findBookBycondition")
    public Message findBookBycondition(Book book){
        return MessageUtil.success(bookService.findBookBycondition(book));
    }

    @PostMapping("addOrUpdateBook")
    public void  addOrUpdateBook(Book book){
        bookService.addOrUpdateBook(book);
    }
    @GetMapping("deleteBook")
    public void   deleteBook(Integer id){
        bookService.deleteBook(id);
    }
}
