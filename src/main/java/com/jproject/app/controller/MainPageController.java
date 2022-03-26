package com.jproject.app.controller;

import com.jproject.app.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("mainPage")
public class MainPageController {

    private final PersonService personService;

    public MainPageController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String getPage(Model model){
        Long el = (long) personService.getNumOfAllUsers();
        model.addAttribute("number",el);
        return "main";
    }
}
