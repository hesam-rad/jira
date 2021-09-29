package com.gam.phoenix.jenkinsjiraintegrationtest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/{name}")
    public String helloWorld(@PathVariable("name") String name){
        return "Hello " + name;
    }
}
