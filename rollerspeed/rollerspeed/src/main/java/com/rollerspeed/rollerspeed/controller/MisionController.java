package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MisionController {

    @GetMapping("/mision")
    public String mostrarMision(Model model) {

        model.addAttribute(
            "titulo",
            "Misión"
        );

        model.addAttribute(
            "contenido",
            "Formar deportistas mediante procesos de enseñanza y entrenamiento en patinaje, promoviendo la disciplina, el respeto, la responsabilidad y el desarrollo integral."
        );

        return "mision";
    }
}
