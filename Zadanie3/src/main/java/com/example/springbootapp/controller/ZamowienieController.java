package com.example.springbootapp.controller;

import com.example.springbootapp.service.ZamowienieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/zamowienia")
public class ZamowienieController {
    @Autowired
    private ZamowienieService zamowienieService;

    @GetMapping("/count/{klientId}")
    public int getOrderCountByClientId(@PathVariable Long klientId) {
        return zamowienieService.getOrderCountByClientId(klientId);
    }

    @GetMapping("/total-cost/{klientId}")
    public Double getTotalCostByClientId(@PathVariable Long klientId) {
        return zamowienieService.getTotalCostByClientId(klientId);
    }

    @GetMapping("/most-ordered-product")
    public Object getMostOrderedProduct() {
        return zamowienieService.getMostOrderedProduct();
    }

    @GetMapping("/product-count/{produktId}")
    public int getProductCountByProductId(@PathVariable Long produktId) {
        return zamowienieService.getProductCountByProductId(produktId);
    }
}