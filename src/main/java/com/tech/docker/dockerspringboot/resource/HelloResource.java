package com.tech.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloResource {
    @GetMapping
    public String hello(){
        return "Welcome to Spring-Boot !!";
    }
    @PostMapping
    public String helloPost(){
        System.out.println("Added resource to DB");
        return "Resource Added";
    }
}
