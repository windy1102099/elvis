package com.example.ssmdemo.service;

import com.example.ssmdemo.entity.Book;
import com.example.ssmdemo.entity.User;
import com.example.ssmdemo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jiangjianhui
 * @create 2018-01-16 10:11
 **/
//Spring中的@Transactional(rollbackFor = Exception.class)事务处理，
// 当你的方法中抛出异常时，它会将 事务回滚，数据库中的数据将不会改变，也就是回到进入此方法前的状态。默认是runtimeException
@Transactional(rollbackFor = Exception.class)
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public void saveBook(String name, Integer authorId) {
        try {
            Book book = new Book();
            book.setName(name);
            User user = new User();
            user.setId(authorId);
            book.setUser(user);
            bookMapper.save(book);
        }
        catch (Exception e){
          throw e;
        }
    }

    @Override
    public List<Book> getAllBooks1(String name,Integer authorId,Integer id) {
        try{
            Map<String, Object> params = new HashMap<String, Object>();
            if (name != null && !"".equals(name.trim())){
                params.put("name", "%" + name + "%");
            }
            if (authorId != null ){
                params.put("authorId", authorId);
            }
            if (id != null){
                params.put("id",id);
            }
            return bookMapper.getAllBooks1(params);
        }catch(Exception ex){
            throw ex;
        }
    }
}
