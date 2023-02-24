package com.example.spring.boot.app.spring_boot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Indice {


    @GetMapping("/")
    public String indice(Model model) {
        model.addAttribute("p", "pippo");
        return "indice";
    }

}
