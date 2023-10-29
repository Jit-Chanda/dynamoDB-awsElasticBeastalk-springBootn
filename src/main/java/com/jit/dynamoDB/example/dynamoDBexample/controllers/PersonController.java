package com.jit.dynamoDB.example.dynamoDBexample.controllers;

import com.jit.dynamoDB.example.dynamoDBexample.entities.Person;
import com.jit.dynamoDB.example.dynamoDBexample.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public Person addPerson(@RequestBody Person person){
        personRepository.addPerson(person);
        return person;
    }

    @GetMapping("/{personId}")
    public Person findPersonByPersonId(@PathVariable String personId){
        return personRepository.findPersonByPersonId(personId);
    }

    @DeleteMapping
    public String deletePerson(@RequestBody Person person){
        return personRepository.deletePerson(person);
    }

    @PutMapping
    public String editPerson(@RequestBody Person person){
        return personRepository.editPerson(person);
    }
}
