package com.gerson.Vibe.services;

import com.gerson.Vibe.dto.requests.music.MusicRequest;
import com.gerson.Vibe.dto.response.music.MusicResponse;
import com.gerson.Vibe.models.Music;
import com.gerson.Vibe.repositories.MusicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MusicService {

    private final MusicRepository musicRepository;

    public List<MusicResponse> getAllMusics(){
        return musicRepository.findAll()
                .stream()
                .map(MusicResponse::new)
                .collect(Collectors.toList());
    }

    public MusicResponse getByIdMusic(Long id){
        Music music = musicRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Musica não Encontrada"));

        return new MusicResponse(music);
    }

    public MusicResponse createMusic(MusicRequest request){

        Music music = new Music();
        music.setName(request.getName());
        music.setDescription(request.getDescription());
        music.setSinger(request.getSinger());
        music.setGenreMusic(request.getGenreMusic());

        Music musicSaved = musicRepository.save(music);

        return new MusicResponse(musicSaved);
    }
}
