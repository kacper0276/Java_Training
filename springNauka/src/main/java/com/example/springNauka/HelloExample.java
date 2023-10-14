package com.example.springNauka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest nie potrzebuje widoku
public class HelloExample {
    @RequestMapping("/")
    public String hello() {
        return  "Hello world";
    }

    // /greeting?name=Kacper
    @RequestMapping("/greeting")
    public String helloAgain(@RequestParam(value = "name", defaultValue = "User") String name) {
            return "Hello " + name;
    }
}
