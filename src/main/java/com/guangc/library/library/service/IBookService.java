package com.guangc.library.library.service;

import com.guangc.library.library.bean.Book;

import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:18
 */
public interface IBookService {
    /*
        查找所有的书
     */
    public List<Book> findAllBook();
    /*
        按条件查找书
     */
    public List<Book> findBookBycondition(Book book);
    /*
        根据id查找书
     */
    public List<Book> findBookById(Integer id);
    /*
        根据类型查找书
     */
    public List<Book> findBookByType(String type);
    /*
        根据书名查找书
     */
    public List<Book> findBookByBookName(String bookname);
    /*
        新增或者修改书籍
     */
    public void addOrUpdateBook(Book book);
    /*
        删除书籍
     */
    public void deleteBook(Integer id);
}
