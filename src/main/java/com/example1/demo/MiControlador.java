package com.example1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/api")  
public class MiControlador {

    @GetMapping("/hola")  
    public String holaSpring() {
        return "¡Hola Spring! Me llamo Gustavo Valverde del grupo 6CV4";
    }
}