package com.rollerspeed.rollerspeed.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventosController {

    @GetMapping("/eventos")
    public String mostrarEventos(Model model) {

        model.addAttribute("titulo", "Eventos de la Escuela");

        model.addAttribute(
                "eventos",
                Arrays.asList(
                        "Entrenamiento general",
                        "Jornada de integración Roller Speed",
                        "Competencia interna de patinaje"
                )
        );

        return "eventos";
    }
}