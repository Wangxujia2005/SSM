package com.wxj.controller;

import com.wxj.pojo.Books;
import com.wxj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books){
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model,int id){
        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("book",books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model,Books book){
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById((book.getBookID()));
        model.addAttribute("book",books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookID}")
    public String deleteBook(@PathVariable("bookID") int bookId){
        bookService.deleteBookById(bookId);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        model.addAttribute("list", list);
        return "allBook";
    }
}
