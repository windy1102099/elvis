package com.example.ssmdemo.mapper;

import com.example.ssmdemo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface BookMapper extends BaseMapper{
    List<Book> getAllBooks();

    List<Book> getAllBooks1(Map<String, Object> params);

}
