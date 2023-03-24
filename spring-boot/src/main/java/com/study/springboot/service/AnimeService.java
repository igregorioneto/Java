package com.study.springboot.service;

import com.study.springboot.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
//    private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return List.of(new Anime(1L,"GTO"), new Anime(2L,"Berserk"));
    }
}
