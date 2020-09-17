package com.tbo.person.domain;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    public PersonResponse getPerson(){
        return null;
    }

    @GetMapping
    public PersonResponse getPersonById(){
        return null;
    }

    @PostMapping
    public PersonResponse addPerson(){
        return null;
    }

    @PutMapping
    public PersonResponse updatePerson(){
        return null;
    }

    @DeleteMapping
    public PersonResponse deletePerson(){
        return null;
    }
}
