package com.example.obrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hola mundo";
    }
}
