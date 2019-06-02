package com.guangc.library.library.service.Impl;

import com.guangc.library.library.bean.Return_book;
import com.guangc.library.library.bean.Return_bookExample;
import com.guangc.library.library.mapper.Return_bookMapper;
import com.guangc.library.library.service.IReturn_bookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:22
 */
@Service
public class Return_bookServiceImpl implements IReturn_bookService {
    @Resource
    private Return_bookMapper return_bookMapper;

    @Override
    public List<Return_book> findAllReturn() {
        return return_bookMapper.selectByExample(new Return_bookExample());
    }

    @Override
    public List<Return_book> findReturnByUserId(Integer userId) {
        Return_bookExample example = new Return_bookExample();
        example.createCriteria().andUserIdEqualTo(userId);
        return return_bookMapper.selectByExample(example);
    }

    @Override
    public Return_book findReturnByid(Integer id) {
        return return_bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void addOrUpadeReturn(Return_book return_book) {
        if(return_book.getReturnId()==null){
            return_bookMapper.insert(return_book);
        }else {
            return_bookMapper.updateByPrimaryKey(return_book);
        }
    }

    @Override
    public void deleteReturn(Integer id) {
        return_bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void batchdeleteReturn(Integer[] ids) {
        for (Integer i:ids) {
            return_bookMapper.deleteByPrimaryKey(i);
        }
    }


}
