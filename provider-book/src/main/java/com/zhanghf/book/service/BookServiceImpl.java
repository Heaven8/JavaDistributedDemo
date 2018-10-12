package com.zhanghf.book.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by YQ11053 on 2018/8/10 0010.
 */
@Component
@Service
public class BookServiceImpl implements  BookService {

    @Override
    public String getTicket() {
        return "《红孩儿》";
    }

    @Override
    public String sovle() {
        return "《收到消息，马上进行处理》";
    }
}
