package com.example.springbootapp.repository;

import com.example.springbootapp.entity.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktRepository extends JpaRepository<Produkt, Long> {
}