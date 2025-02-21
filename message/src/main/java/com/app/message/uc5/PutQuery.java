package com.app.message.uc5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class PutQuery {

    @PutMapping("/put/{firstName}")
    public String helper(@PathVariable String firstName, @RequestParam("lastname") String lastName) {
        return "Hello " + firstName + " " + lastName + " from Bridgelabz!";
    }
}
