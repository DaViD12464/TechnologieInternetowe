package com.example.springbootapp.repository;

import com.example.springbootapp.entity.Zamowienie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ZamowienieRepository extends JpaRepository<Zamowienie, Long> {

    @Query("SELECT COUNT(z) FROM Zamowienie z WHERE z.klient.id = :klientId")
    int countByKlientId(Long klientId);

    @Query("SELECT SUM(z.ilosc) FROM Zamowienie z WHERE z.klient.id = :klientId")
    Double sumByKlientId(@Param("klientId") Long klientId);

    @Query("SELECT z.produkt, COUNT(z.produkt) as cnt FROM Zamowienie z GROUP BY z.produkt ORDER BY cnt DESC")
    List<Object[]> findMostOrderedProduct();

    @Query("SELECT SUM(z.ilosc) FROM Zamowienie z WHERE z.produkt.id = :produktId")
    int countByProduktId(Long produktId);
}