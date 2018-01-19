package com.example.ssmdemo.service;

import com.example.ssmdemo.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    void saveBook(String name, Integer outhorId);

    List<Book> getAllBooks1(String name,Integer authorId,Integer id);

}
