package com.devtiro.database.mappers.impl;

import com.devtiro.database.domain.dto.AuthorDto;
import com.devtiro.database.domain.dto.BookDto;
import com.devtiro.database.domain.entities.AuthorEntity;
import com.devtiro.database.domain.entities.BookEntity;
import com.devtiro.database.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements Mapper<BookEntity, BookDto> {

    private final Mapper<AuthorEntity, AuthorDto> authorMapper = new AuthorMapperImpl();

    @Override
    public BookDto mapTo(BookEntity bookEntity) {
        if (bookEntity == null) return null;
        return new BookDto(bookEntity.getIsbn(), bookEntity.getTitle(),authorMapper.mapTo(bookEntity.getAuthorEntity()));
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        if (bookDto == null) return null;
        return new BookEntity(bookDto.getIsbn(),bookDto.getTitle(),authorMapper.mapFrom(bookDto.getAuthor()));
    }
}
