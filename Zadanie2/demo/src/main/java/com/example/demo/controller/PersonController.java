package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Person;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonRepository repository;

    public PersonController(PersonRepository repository)
    {
        this.repository = repository;
    }

    @GetMapping
    public Page<Person> FindAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        PageRequest pr = PageRequest.of(page,size);
        return repository.findAll(pr);
    }
}
