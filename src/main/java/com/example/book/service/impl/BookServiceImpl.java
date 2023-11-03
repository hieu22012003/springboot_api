package com.example.book.service.impl;

import com.example.book.entity.Book;
import com.example.book.repository.BookRepository;
import com.example.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Book create(Book Book) {
        if (Book.getAuthor() == null  || Book.getAuthor().isEmpty()) {
            return null;
        }

        if (Book.getTitle() == null  || Book.getTitle().isEmpty()) {
            return null;
        }

        return bookRepository.save(Book);
    }

    @Override
    public Book update(Long id, Book Book) {
        Book fromDB = bookRepository.findById(id).orElse(null);
        if (fromDB == null) {
            return null;
        }
        fromDB.setAuthor(Book.getAuthor());
        fromDB.setTitle(Book.getTitle());
        return bookRepository.save(fromDB);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
