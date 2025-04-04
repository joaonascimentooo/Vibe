package com.gerson.Vibe.dto.requests;

import com.gerson.Vibe.enums.Genre;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequest {

    @NotBlank(message = "Nome é obrigatorio")
    @Size(min= 3, message = "É necessario no minimo três caracteres")
    @Size(max = 50, message = "O maximo de caracteres é 50")
    private String name;

    @NotBlank(message = "A descrição é obrigatoria")
    private String description;

    @NotBlank(message = "O nome do autor é obrigatorio")
    private String author;

    private Genre genre;
}
