package com.javadevops.springapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String getWelcomePage(Model model) {
        model.addAttribute("person", "Student");
        model.addAttribute("date", new Date().toString());
        return "index";
    }

    @GetMapping("/{name}")
    public String getWelcomePageWithPathVariable(@PathVariable("name") String name, Model model) {
        model.addAttribute("person", name);
        model.addAttribute("date", new Date().toString());
        return "index";
    }
}
