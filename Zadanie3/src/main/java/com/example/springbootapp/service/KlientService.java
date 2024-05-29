package com.example.springbootapp.service;

import com.example.springbootapp.entity.Klient;
import com.example.springbootapp.repository.KlientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KlientService {
    @Autowired
    private KlientRepository klientRepository;

    public Optional<Klient> findById(Long id) {
        return klientRepository.findById(id);
    }
}


