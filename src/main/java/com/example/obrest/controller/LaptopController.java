package com.example.obrest.controller;

import com.example.obrest.entity.Laptop;
import com.example.obrest.repository.LaptopRepository;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

}
