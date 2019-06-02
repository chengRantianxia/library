package com.guangc.library.library.web.controller;

import com.guangc.library.library.bean.Return_book;
import com.guangc.library.library.service.IReturn_bookService;
import com.guangc.library.library.utils.Message;
import com.guangc.library.library.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangcheng
 * @date 2019/5/16 15:56
 */
@RestController
@RequestMapping("/retrun_book")
public class Return_bookController {
    @Autowired
    private IReturn_bookService returnBookService;

    @GetMapping("findAllReturn")
    public Message findAllReturn(){
        return MessageUtil.success(returnBookService.findAllReturn());
    }

    @GetMapping("findReturnByid")
    public Message findReturnByid(Integer id){
        System.out.println(id);
        return MessageUtil.success(returnBookService.findReturnByid(id));
    }

    @GetMapping("findReturnByUserId")
    public Message findReturnByUserId(Integer userId){
        return MessageUtil.success(returnBookService.findReturnByUserId(userId));
    }
    @PostMapping("addOrUpadeReturn")
    public void addOrUpadeReturn(Return_book return_book){
        returnBookService.addOrUpadeReturn(return_book);
    }
    @GetMapping("deleteReturn")
    public void deleteReturn(Integer id){
        returnBookService.deleteReturn(id);
    }
    @GetMapping("batchdeleteReturn")
    public void batchdeleteReturn(Integer[] ids){
        returnBookService.batchdeleteReturn(ids);
    }

}
