package com.gerson.Vibe.controllers;

import com.gerson.Vibe.dto.requests.music.MusicRequest;
import com.gerson.Vibe.dto.response.music.MusicResponse;
import com.gerson.Vibe.models.Music;
import com.gerson.Vibe.services.MusicService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/music")
public class MusicController {

    private final MusicService musicService;

    @GetMapping
    public ResponseEntity<List<MusicResponse>> getAllMusics(){
        List<MusicResponse> musicResponses = musicService.getAllMusics();

        return ResponseEntity.ok(musicResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MusicResponse> getByIdMusic(@PathVariable Long id){
        MusicResponse musicResponse = musicService.getByIdMusic(id);

        return ResponseEntity.ok(musicResponse);
    }

    @PostMapping
    public ResponseEntity<MusicResponse> createMusic(@RequestBody @Valid MusicRequest musicRequest){
        MusicResponse musicResponse = musicService.createMusic(musicRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(musicResponse);
    }
}
