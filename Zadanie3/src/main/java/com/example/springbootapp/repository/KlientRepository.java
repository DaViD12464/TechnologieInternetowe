
package com.example.springbootapp.repository;

import com.example.springbootapp.entity.Klient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KlientRepository extends JpaRepository<Klient, Long> {
}


