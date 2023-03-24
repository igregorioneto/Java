package com.study.springboot.repository;

import com.study.springboot.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
