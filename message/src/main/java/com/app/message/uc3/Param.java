package com.app.message.uc3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Param {

    @GetMapping("/hello/param/{a}")
    public String param(@PathVariable String a, Model model){
        model.addAttribute("value",a);
        return "param";
    }

}
