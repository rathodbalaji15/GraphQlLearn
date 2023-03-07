package com.graphql.controller;

import com.graphql.entity.Book;
import com.graphql.service.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    //create

@MutationMapping("createBook")
    public Book create(@Argument BookInput book){
    Book b= new Book();
    b.setAuthor(book.getAuthor());
    b.setDesc(book.getDesc());
    b.setPrice(book.getPrice());
    b.setPages(book.getPages());
    b.setName(book.getName());
        return this.bookService.create(b);
    }
    //get all
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }
    //get single
    @QueryMapping("getBook")
    public Book get(@Argument int bookId){
        return this.bookService.get(bookId);

    }

}
@Getter
@Setter
class BookInput{
    private String desc;
    private String author;
    private double price;
    private int pages;
    private  String name;

}