package com.guangc.library.library.web.controller;

import com.guangc.library.library.bean.Order_book;
import com.guangc.library.library.service.IOrder_bookService;
import com.guangc.library.library.utils.Message;
import com.guangc.library.library.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangcheng
 * @date 2019/5/16 19:04
 */
@RestController
@RequestMapping("/order")
public class Order_bookController {
    @Autowired
    private IOrder_bookService orderBookService;

    @GetMapping("findAll")
    public Message findAll(){
        return MessageUtil.success(orderBookService.findAll());
    }
    @GetMapping("findOrder_book")
    public Message findOrder_book(Integer id){
        return MessageUtil.success(orderBookService.findOrder_book(id));
    }
    @GetMapping("findOrder_bookByUserId")
    public Message findOrder_bookByUserId(Integer userid){
        return MessageUtil.success(orderBookService.findOrder_bookByUserId(userid));
    }
    @GetMapping("deleteOrder_book")
    public void deleteOrder_book(Integer id){
        orderBookService.deleteOrder_book(id);
    }
    @PostMapping("addOrUpdateOrder_book")
    public void addOrUpdateOrder_book(Order_book order_book){
        orderBookService.addOrUpdateOrder_book(order_book);
    }
    @GetMapping("batchdeleteOrderBook")
    public void batchdeleteOrderBook(Integer[] ids){
        orderBookService.batchdeleteOrder_book(ids);
    }

}
