package com.rollerspeed.rollerspeed.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ValoresController {

    @GetMapping("/valores")
    public String mostrarValores(Model model) {

        model.addAttribute("titulo", "Valores");

        model.addAttribute(
                "valores",
                Arrays.asList(
                        "Disciplina",
                        "Respeto",
                        "Responsabilidad",
                        "Compromiso",
                        "Trabajo en equipo"
                )
        );

        return "valores";
    }
}