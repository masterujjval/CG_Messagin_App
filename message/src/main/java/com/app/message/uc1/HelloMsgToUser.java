package com.app.message.uc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloMsgToUser {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


}
