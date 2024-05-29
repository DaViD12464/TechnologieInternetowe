package com.example.demo;

import jakarta.persistence.*;

import javax.naming.Name;

@Entity
@Table(name="tabela")
public class Tabela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String val1;
    private String val2;

    public Tabela() {
    }

    public Tabela(String val1, String val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }
}
