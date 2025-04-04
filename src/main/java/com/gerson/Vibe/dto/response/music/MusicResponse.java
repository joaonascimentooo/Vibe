package com.gerson.Vibe.dto.response.music;

import com.gerson.Vibe.enums.GenreMusic;
import com.gerson.Vibe.models.Music;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicResponse {

    private Long id;

    private String name;

    private String description;

    private String singer;

    private GenreMusic genreMusic;

    public MusicResponse(Music music){
        this.id = music.getId();
        this.name = music.getName();
        this.description = music.getDescription();
        this.singer = music.getSinger();
        this.genreMusic = music.getGenreMusic();
    }
}
