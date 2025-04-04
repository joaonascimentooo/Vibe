package com.gerson.Vibe.controllers;

import com.gerson.Vibe.dto.requests.book.BookRequest;
import com.gerson.Vibe.dto.response.book.BookResponse;
import com.gerson.Vibe.services.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAllBooks(){
        List<BookResponse> bookResponses = bookService.getAllBooks();
        return ResponseEntity.ok(bookResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> getBookById(@PathVariable Long id){
        BookResponse bookResponse = bookService.getBookById(id);
        return ResponseEntity.ok(bookResponse);
    }

    @PostMapping
    public ResponseEntity<BookResponse> createBook(@RequestBody @Valid BookRequest bookRequest){
        BookResponse response = bookService.createBook(bookRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
