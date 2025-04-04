package com.gerson.Vibe.dto.requests.music;

import com.gerson.Vibe.enums.GenreMusic;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MusicRequest {

    @NotBlank(message = "O nome é obrigatorio")
    private String name;

    @NotBlank( message = "A descrição é obrigatoria")
    private String description;

    @NotBlank( message = "O cantor é obrigatorio")
    private String singer;

    @NotNull(message = "O genero da musica não pode ser nulo")
    private GenreMusic genreMusic;
}
