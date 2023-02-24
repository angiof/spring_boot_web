package com.example.spring.boot.app.spring_boot_web.controllers

import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping(value = [ "/", "/home"])
fun index(model: ModelMap): String? {
    model.addAttribute("titulo", "hola desde fremawork")
    return "pomelo"
}

