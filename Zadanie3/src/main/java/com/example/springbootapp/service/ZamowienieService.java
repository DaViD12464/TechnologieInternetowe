package com.example.springbootapp.service;

import com.example.springbootapp.repository.ZamowienieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZamowienieService {
    @Autowired
    private ZamowienieRepository zamowienieRepository;

    public int getOrderCountByClientId(Long klientId) {
        return zamowienieRepository.countByKlientId(klientId);
    }

    public Double getTotalCostByClientId(Long klientId) {
        return zamowienieRepository.sumByKlientId(klientId);
    }

    public Object getMostOrderedProduct() {
        List<Object[]> result = zamowienieRepository.findMostOrderedProduct();
        return result.isEmpty() ? null : result.get(0)[0];
    }

    public int getProductCountByProductId(Long produktId) {
        return zamowienieRepository.countByProduktId(produktId);
    }
}