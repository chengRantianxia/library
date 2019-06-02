package com.guangc.library.library.service;

import com.guangc.library.library.bean.Return_book;

import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:20
 */
public interface IReturn_bookService {
    /*
        查询所有的归还信息
     */
    public List<Return_book> findAllReturn();
    /*
        通过用户id查询归还信息
     */
    public List<Return_book> findReturnByUserId(Integer userId);
    /*
        根据id查询归还信息
     */
    public Return_book findReturnByid(Integer id);
    /*
        新增或者修改归还信息
     */
    public void addOrUpadeReturn(Return_book return_book);
    /*
        删除归还信息
     */
    public void deleteReturn(Integer id);
    /*
        批量删除归还信息
     */
    public void batchdeleteReturn(Integer[] ids);
}
