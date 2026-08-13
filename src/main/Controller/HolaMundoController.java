package com.example.holaMundo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1")

public class HolaMundoController {
    public String holaMundo() {
        return "Hola Mundo v1.0.0";
    }

    @PostMapping("/despedida")
    public String despedida() {
        return "Adios Mundo v1.0.0";
    }
}
