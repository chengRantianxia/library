package com.guangc.library.library.service.Impl;

import com.guangc.library.library.bean.Order_book;
import com.guangc.library.library.bean.Order_bookExample;
import com.guangc.library.library.mapper.Order_bookMapper;
import com.guangc.library.library.service.IOrder_bookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:22
 */
@Service
public class Order_bookServiceImpl implements IOrder_bookService {
    @Resource
    private Order_bookMapper order_bookMapper;

    @Override
    public List<Order_book> findAll() {
        return order_bookMapper.selectByExample(new Order_bookExample());
    }

    @Override
    public Order_book findOrder_book(Integer id) {
        return order_bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Order_book> findOrder_bookByUserId(Integer userId) {
        Order_bookExample example = new Order_bookExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return order_bookMapper.selectByExample(example);
    }

    @Override
    public void addOrUpdateOrder_book(Order_book order_book) {
        if(order_book.getOrderId()==null){
            order_bookMapper.insert(order_book);
        }else {
            order_bookMapper.updateByPrimaryKey(order_book);
        }
    }

    @Override
    public void deleteOrder_book(Integer id) {
        order_bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchdeleteOrder_book(Integer[] ids) {
        for (Integer i:ids) {
            order_bookMapper.deleteByPrimaryKey(i);
        }
    }

}
