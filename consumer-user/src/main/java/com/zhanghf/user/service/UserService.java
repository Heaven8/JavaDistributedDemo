package com.zhanghf.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhanghf.book.service.BookService;
import org.springframework.stereotype.Service;

/**
 * Created by YQ11053 on 2018/8/9 0009.
 */
@Service
public class UserService {
    @Reference
    BookService bookService;


    public String hello(){
       String book =  bookService.getTicket();
        System.out.println("买到票了"+book);
        return book;
    }


}
