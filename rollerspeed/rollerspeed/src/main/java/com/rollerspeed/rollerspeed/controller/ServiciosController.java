package com.rollerspeed.rollerspeed.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiciosController {

    @GetMapping("/servicios")
    public String mostrarServicios(Model model) {

        model.addAttribute("titulo", "Servicios");

        model.addAttribute(
                "servicios",
                Arrays.asList(
                        "Clases de iniciación en patinaje",
                        "Entrenamiento deportivo",
                        "Clases para principiantes",
                        "Preparación para competencias"
                )
        );

        return "servicios";
    }
}