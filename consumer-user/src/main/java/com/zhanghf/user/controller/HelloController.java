package com.zhanghf.user.controller;

import com.zhanghf.user.service.UserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YQ11053 on 2018/8/10 0010.
 */
@Controller
public class HelloController {

    @Autowired
    UserService userService;
    @Autowired
    RabbitTemplate rabbitTemplate;

    @ResponseBody
    @GetMapping("/hello")
    public Map<String, Object> hello(){
        Map<String,Object> data = new HashMap<String,Object>();
        String param = userService.hello();
        data.put("msg",param);
        data.put("result_code",1);
        rabbitTemplate.convertAndSend("exchange.direct","zhanghf.news",data);
        return  data;
    }


}
