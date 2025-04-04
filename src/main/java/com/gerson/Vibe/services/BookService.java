package com.gerson.Vibe.services;

import com.gerson.Vibe.dto.requests.BookRequest;
import com.gerson.Vibe.dto.response.BookResponse;
import com.gerson.Vibe.models.Book;
import com.gerson.Vibe.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<BookResponse> getAllBooks(){
        return bookRepository.findAll()
                .stream()
                .map(BookResponse::new)
                .collect(Collectors.toList());
    }

    public BookResponse getBookById(Long id){
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        return new BookResponse(book);
    }

    public BookResponse createBook(BookRequest request){

        Book book = new Book();
        book.setName(request.getName());
        book.setDescription(request.getDescription());
        book.setAuthor(request.getAuthor());
        book.setGenre(request.getGenre());

        Book bookedsaved = bookRepository.save(book);

        return new BookResponse(bookedsaved);


    }
}
