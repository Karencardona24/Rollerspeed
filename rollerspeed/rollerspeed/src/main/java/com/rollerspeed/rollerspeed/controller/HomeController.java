package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio(Model model) {

        model.addAttribute(
            "titulo",
            "Escuela de Patinaje Roller Speed"
        );

        model.addAttribute(
            "descripcion",
            "Plataforma web para la información y futura gestión de la escuela de patinaje Roller Speed."
        );

        return "index";
    }
}