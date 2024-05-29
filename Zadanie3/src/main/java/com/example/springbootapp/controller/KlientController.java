package com.example.springbootapp.controller;

import com.example.springbootapp.entity.Klient;
import com.example.springbootapp.service.KlientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/klienci")
public class KlientController {
    @Autowired
    private KlientService klientService;

    @GetMapping("/{id}")
    public Optional<Klient> getKlientById(@PathVariable Long id) {
        return klientService.findById(id);
    }
}


