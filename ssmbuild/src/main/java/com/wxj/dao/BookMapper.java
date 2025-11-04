package com.wxj.dao;

import com.wxj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一个book
    int addBook(Books book);

    //根据id删除一个book
    int deleteBookByID(@Param("bookID") int id);

    //更新一个book
    int updateBook(Books book);

    //根据id查询，返回一个book
    Books queryBookByID(@Param("bookID") int id);

    //查询全部Book，返回list集合
    List<Books> queryAllBook();

    //根据书名查询书籍
    Books queryBookByName(@Param("bookName") String name);
}
