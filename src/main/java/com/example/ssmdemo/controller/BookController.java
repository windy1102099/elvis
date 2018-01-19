package com.example.ssmdemo.controller;

import com.example.ssmdemo.entity.Book;
import com.example.ssmdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangjianhui
 * @create 2018-01-16 10:14
 **/
@RestController
public class BookController {
    @Autowired
    BookService bookService;

    /**
     * @Author: JiangJianHui
     * @Description:获取所有书
     * @param
     * @Date 11:26 2018/1/19 0019
     */
    @RequestMapping(value = "getAllBook")
    public List<String> getAllBook(){
        List<String> result = new ArrayList<>();
        List<Book> bookList = bookService.getAllBooks();
        if(bookList.size()>0){
            for(int i = 0; i < bookList.size(); i++){
                Book book = bookList.get(i);
                StringBuffer temp = new StringBuffer("书名:"+book.getName()+"");
                if(null!=book.getUser()){
                    temp.append(" 作者:"+book.getUser().getUsername()+"");
                }
                result.add(temp.toString());
            }
        }
        return result;
    }

    /**
     * @Author: JiangJianHui
     * @Description:新增
     * @param name
     * @param authorId
     * @Date 11:26 2018/1/19 0019
     */
    @RequestMapping(value = "saveBook")
    public String saveBook(String name,Integer authorId){
        String result = "false";
        try {
            bookService.saveBook(name,authorId);
             result = "sucess";
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * @Author: JiangJianHui
     * @Description:根据条件查询
     * @param name
     * @param authorId
     * @param id
     * @Date 14:53 2018/1/19 0019
     */
    @RequestMapping(value = "getAllBook1")
    public List<String> getAllBook(String name,Integer authorId,Integer id){
        List<String> result = new ArrayList<>();
        List<Book> bookList = bookService.getAllBooks1(name,authorId,id);
        if(bookList.size()>0){
            for(int i = 0; i < bookList.size(); i++){
                Book book = bookList.get(i);
                StringBuffer temp = new StringBuffer("书名:"+book.getName()+"");
                if(null!=book.getUser()){
                    temp.append(" 作者:"+book.getUser().getUsername()+"");
                }
                result.add(temp.toString());
            }
        }
        return result;
    }
}
