package com.gerson.Vibe.models;

import com.gerson.Vibe.enums.GenreMusic;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "musics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String singer;

    @Enumerated(EnumType.STRING)
    private GenreMusic genreMusic;
}
