package com.devtiro.database.mappers.impl;

import com.devtiro.database.domain.dto.AuthorDto;
import com.devtiro.database.domain.entities.AuthorEntity;
import com.devtiro.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapperImpl implements Mapper<AuthorEntity, AuthorDto> {

    @Override
    public AuthorDto mapTo(AuthorEntity authorEntity) {
        if (authorEntity == null) return null;
        return new AuthorDto(authorEntity.getId(), authorEntity.getName(), authorEntity.getAge());
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto) {
        if (authorDto == null) return null;
        return new AuthorEntity(authorDto.getId(), authorDto.getName(), authorDto.getAge());
    }
}
