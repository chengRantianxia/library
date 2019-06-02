package com.guangc.library.library.service.Impl;

import com.guangc.library.library.bean.Book;
import com.guangc.library.library.bean.BookExample;
import com.guangc.library.library.bean.Lease;
import com.guangc.library.library.mapper.BookMapper;
import com.guangc.library.library.mapper.LeaseMapper;
import com.guangc.library.library.service.IBookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guangcheng
 * @date 2019/5/16 14:21
 */
@Service
public class BookServiceImpl implements IBookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public List<Book> findAllBook() {
        return bookMapper.selectByExample(new BookExample());
    }

    @Override
    public List<Book> findBookBycondition(Book book) {
        BookExample example = new BookExample();
        if(book.getBookAuthor()==null){
            if(book.getBookType()==null){
                if(book.getBookName()==null){
                    return bookMapper.selectByExample(example);
                }else {
                    example.createCriteria().andBookNameLike("%"+book.getBookName()+"%");
                }
            }else {
                if(book.getBookName()==null){
                    example.createCriteria().andBookTypeLike("%"+book.getBookType()+"%");
                }else {
                    example.createCriteria().andBookTypeLike("%"+book.getBookType()+"%").andBookNameLike("%"+book.getBookName()+"%");
                }
            }
        }else {
            if(book.getBookType()==null){
                if(book.getBookName()==null){
                    example.createCriteria().andBookAuthorLike("%"+book.getBookAuthor()+"%");
                }else {
                    example.createCriteria().andBookNameLike("%"+book.getBookName()+"%").andBookAuthorLike("%"+book.getBookAuthor()+"%");
                }
            }else {
                if(book.getBookName()==null){
                    example.createCriteria().andBookTypeLike("%"+book.getBookType()+"%").andBookAuthorLike("%"+book.getBookAuthor()+"%");
                }else {
                    example.createCriteria().andBookTypeLike("%"+book.getBookType()+"%").andBookNameLike("%"+book.getBookName()+"%").andBookAuthorLike("%"+book.getBookAuthor()+"%");
                }
            }
        }
//        example.createCriteria().andBookAuthorLike("%"+book.getBookAuthor()+"%");
        return bookMapper.selectByExample(example);
    }

    @Override
    public List<Book> findBookById(Integer id) {
        List<Book> list=new ArrayList<>();
        list.add(bookMapper.selectByPrimaryKey(id));
        return list;

    }

    @Override
    public List<Book> findBookByType(String type) {
        BookExample example = new BookExample();
        example.createCriteria().andBookTypeLike("%"+type+"%");
        return bookMapper.selectByExample(example);
    }

    @Override
    public List<Book> findBookByBookName(String bookname) {
        BookExample example = new BookExample();
        example.createCriteria().andBookNameLike("%"+bookname+"%");
        return bookMapper.selectByExample(example);
    }

    @Override
    public void addOrUpdateBook(Book book) {
        if(book.getBookId()==null){
            bookMapper.insert(book);
        }else {
            bookMapper.updateByPrimaryKey(book);
        }
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteByPrimaryKey(id);
    }
}
