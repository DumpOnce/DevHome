package com.jproject.app.controller;

import com.jproject.app.entities.Person;
import com.jproject.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("database1")
public class LogicController {


    private final PersonService personService;

    public LogicController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public String putElement(@RequestParam String firstname,@RequestParam String lastname,@RequestParam Long id){
        Person person = new Person(id,lastname,firstname);
        personService.addPerson(person);
        return "addPerson";
    }



}
