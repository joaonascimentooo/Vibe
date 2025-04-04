package com.gerson.Vibe.dto.response.book;

import com.gerson.Vibe.enums.Genre;
import com.gerson.Vibe.models.Book;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {

    private Long id;

    private String name;

    private String description;

    private String author;

    private Genre genre;

    public BookResponse(Book book){
        this.id = book.getId();
        this.name = book.getName();
        this.description = book.getDescription();
        this.author = book.getAuthor();
        this.genre = book.getGenre();
    }
}
