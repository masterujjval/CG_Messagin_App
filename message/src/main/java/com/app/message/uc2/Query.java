package com.app.message.uc2;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Query {

    @GetMapping("/hello/query")
    public String query(@RequestParam("name") String ss,Model model){
        model.addAttribute("name",ss);
        return "name";

    }
}