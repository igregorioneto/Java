package com.study.springboot.service;

import com.study.springboot.domain.Anime;
import com.study.springboot.exception.BadRequestException;
import com.study.springboot.mapper.AnimeMapper;
import com.study.springboot.repository.AnimeRepository;
import com.study.springboot.requests.AnimePostRequestBody;
import com.study.springboot.requests.AnimePutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    public Page<Anime> listAll(Pageable pageable) {
        return animeRepository.findAll(pageable);
    }

    public Anime findByIdOrThrowBadRequestException(long id) {
        return animeRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Anime not found!"));
    }

    @Transactional
    public Anime save(AnimePostRequestBody anime) {
        return animeRepository.save(AnimeMapper.INSTANCE.toAnime(anime));
    }

    public void delete(long id) {
        animeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

    public void replace(AnimePutRequestBody anime) {
       Anime savedAnime = findByIdOrThrowBadRequestException(anime.getInd());
       Anime animePut = AnimeMapper.INSTANCE.toAnime(anime);
       anime.setInd(savedAnime.getId());
       animeRepository.save(animePut);
    }

    public List<Anime> findByName(String name) {
        return animeRepository.findByName(name);
    }
}
