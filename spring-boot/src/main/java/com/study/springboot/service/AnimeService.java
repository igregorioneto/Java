package com.study.springboot.service;

import com.study.springboot.domain.Anime;
import com.study.springboot.repository.AnimeRepository;
import com.study.springboot.requests.AnimePostRequestBody;
import com.study.springboot.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class AnimeService {
     private final AnimeRepository animeRepository;
//    private static List<Anime> animes;

//    static {
//        animes = new ArrayList<>(List.of(new Anime(1L, "GTI"), new Anime(2L, "Berserk")));
//    }

    public List<Anime> listAll() {
        return animeRepository.findAll();
    }

    public Anime findByIdOrThrowBadRequestException(long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }

    public Anime save(AnimePostRequestBody anime) {
        return animeRepository.save(Anime.builder().name(anime.getName()).build());
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody anime) {
       Anime savedAnime = findByIdOrThrowBadRequestException(anime.getInd());
       Anime animePut = Anime.builder()
               .id(savedAnime.getId())
               .name(anime.getName())
               .build();
       animeRepository.save(animePut);
    }
}
