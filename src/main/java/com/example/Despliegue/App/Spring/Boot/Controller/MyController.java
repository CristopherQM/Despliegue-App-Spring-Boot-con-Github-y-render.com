package com.example.Despliegue.App.Spring.Boot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/nombre")
    public String getNombre() {
        return "Cristopher Quintanilla";
    }
}