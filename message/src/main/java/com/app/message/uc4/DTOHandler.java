package com.app.message.uc4;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class DTOHandler {

    @PostMapping("/post")
    public String curlHandler(@RequestBody DTO user){
        return "Hello"+user.getFirstName()+" "+user.getLastName()+" "+"from Bridgelabz!";
    }
}
