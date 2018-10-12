package com.zhanghf.employee.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhanghf.book.service.BookService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by YQ11053 on 2018/8/15 0015.
 */
@Service
public class EmployeeServiceImpl implements  EmployeeService {

    @Reference
    BookService bookService;

    @RabbitListener(queues = "zhanghf.news")
    public void receive(Map<String, Object> data){
        System.out.println("收到消息："+data);
        System.out.println(bookService.sovle());
    }

}
