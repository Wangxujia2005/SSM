package com.wxj.service;

import com.wxj.dao.BookMapper;
import com.wxj.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    // 调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);//这里是调用的Mapper里的方法
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookByID(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookByID(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String name){
        return bookMapper.queryBookByName(name);
    }
}
