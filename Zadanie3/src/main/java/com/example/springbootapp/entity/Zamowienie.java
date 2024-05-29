package com.example.springbootapp.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Zamowienie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Klient klient;

    @ManyToOne
    private Produkt produkt;

    private Date dataZamowienia;
    private int ilosc;

    public Zamowienie() {
    }

    public Zamowienie(Klient klient, Produkt produkt, Date dataZamowienia, int ilosc) {
        this.klient = klient;
        this.produkt = produkt;
        this.dataZamowienia = dataZamowienia;
        this.ilosc = ilosc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }

    public Date getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(Date dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}