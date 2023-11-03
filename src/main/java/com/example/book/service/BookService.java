package com.example.book.service;

import com.example.book.entity.Book;

public interface BookService {
    Book create(Book book);
    Book update(Long id, Book book);
    void delete(Long id);
    Book findById(Long id);
    Iterable<Book> findAll();
}