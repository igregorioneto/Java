package com.study.springboot.mapper;

import com.study.springboot.domain.Anime;
import com.study.springboot.requests.AnimePostRequestBody;
import com.study.springboot.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel="spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody anime);

    public abstract Anime toAnime(AnimePutRequestBody anime);
}
