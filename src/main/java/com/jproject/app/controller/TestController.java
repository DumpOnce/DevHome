package com.jproject.app.controller;

import com.jproject.app.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/main")
public class TestController {

    @GetMapping
    public @ResponseBody String getPage(){
        return "hiISaid";
    }

    @GetMapping(value="/delete/{id}" ,produces = "application/html")
    public String deleteElement( /*@ModelAttribute("model")*/ @PathVariable("id") int id,Model model){
      Person person = new Person();
        person.setId((long) id);
        model.addAttribute("model",person);
        return "delete";
    }
    @PostMapping(value="/addit" ,produces = "application/json")
    public @ResponseBody Person getPage(@RequestBody Person person){
        return new Person(person.getId(),person.getFirstName(), person.getLastName());
    }

}
