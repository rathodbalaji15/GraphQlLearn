package com.graphql.service;

import com.graphql.entity.Book;

import java.util.List;

public interface BookService {
    //create
    public Book create(Book book);

    //get all
    public List<Book> getAll();

    // get sigle book
    public Book get(int bookId);
}
