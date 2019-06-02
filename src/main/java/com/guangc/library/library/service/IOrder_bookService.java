package com.guangc.library.library.service;

import com.guangc.library.library.bean.Order_book;

import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:19
 */
public interface IOrder_bookService {
    /*
        查找所有的订购信息
     */
    public List<Order_book> findAll();
    /*
        根据id查询订单
     */
    public Order_book findOrder_book(Integer id);
    /*
        根据用户id查询订单
     */
    public List<Order_book> findOrder_bookByUserId(Integer userId);
    /*
        新增或者修改订单信息
     */
    public void addOrUpdateOrder_book(Order_book order_book);
    /*
        删除订单信息
     */
    public void deleteOrder_book(Integer id);
    /*
        批量删除订单信息
     */
    public void batchdeleteOrder_book(Integer[] ids);
}
