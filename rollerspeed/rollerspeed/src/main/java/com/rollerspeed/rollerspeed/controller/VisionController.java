package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisionController {

    @GetMapping("/vision")
    public String mostrarVision(Model model) {

        model.addAttribute("titulo", "Visión");

        model.addAttribute(
                "contenido",
                "Ser una escuela de patinaje reconocida por la formación integral de sus deportistas, la disciplina y el desarrollo de nuevos talentos."
        );

        return "vision";
    }
}