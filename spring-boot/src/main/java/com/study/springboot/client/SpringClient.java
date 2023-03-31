package com.study.springboot.client;

import com.study.springboot.domain.Anime;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class SpringClient {
    public static void main(String[] args) {
        ResponseEntity<Anime> entity = new RestTemplate().getForEntity(
                "http://localhost:8080/animes/{id}",
                Anime.class,
                2
        );
        log.info(entity);

        Anime object = new RestTemplate().getForObject(
                "http://localhost:8080/animes/{id}",
                Anime.class,
                2
        );
        log.info(object);

        Anime[] animes = new RestTemplate().getForObject(
                "http://localhost:8080/animes/all",
                Anime[].class
        );
        log.info(Arrays.toString(animes));

        ResponseEntity<List<Anime>> exchange = new RestTemplate().exchange(
                "http://localhost:8080/animes/all",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {}
        );
        log.info(exchange.getBody());

//        Criando animes
        Anime newAnime = Anime.builder().name("DBZ").build();
        Anime newAnimeSaved = new RestTemplate().postForObject(
                "http://localhost:8080/animes/",
                newAnime,
                Anime.class
        );
        log.info("Saved anime {}", newAnimeSaved);

        Anime digimon = Anime.builder().name("Digimon").build();
        ResponseEntity<Anime> digimonSaved = new RestTemplate().exchange(
                "http://localhost:8080/animes/",
                HttpMethod.POST,
                new HttpEntity<>(digimon, createJsonHeader()),
                Anime.class
        );
        log.info("Saved anime {}", digimon);

//        Atualizando anime
        Anime animeUpdated = digimonSaved.getBody();
        animeUpdated.setName("Digimon 3");

        ResponseEntity<Void> digimonUpdated = new RestTemplate().exchange(
                "http://localhost:8080/animes/",
                HttpMethod.PUT,
                new HttpEntity<>(animeUpdated, createJsonHeader()),
                Void.class
        );
        log.info(digimonUpdated);

        ResponseEntity<Void> digimonDeleted = new RestTemplate().exchange(
                "http://localhost:8080/animes/",
                HttpMethod.DELETE,
                null,
                Void.class,
                animeUpdated.getId()
        );
        log.info(digimonDeleted);
    }

    private static HttpHeaders createJsonHeader() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return httpHeaders;
    }
}
