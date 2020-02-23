package com.afiefafian.book.controller;

import com.afiefafian.book.domain.Book;
import com.afiefafian.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookRepository BookRepository;

    @GetMapping
    public Iterable<Book> getBooks() {
        return BookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable("id") String id) {
        return BookRepository.findById(id);
    }

    @PostMapping
    public ResponseEntity<Book> addNewBook(@RequestBody Book book) {
        Book newBook = BookRepository.save(book);
        return new ResponseEntity<>(newBook, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable("id") String id) {
        BookRepository.deleteById(id);
    }

}

