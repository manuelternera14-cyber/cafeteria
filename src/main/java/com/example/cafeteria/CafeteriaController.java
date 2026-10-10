package com.example.cafeteria;


import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CafeteriaController {

    @GetMapping("/bienvenida")
    public String bienvenida() {
        return "Bienvenido a Café Andino";
    }

    @GetMapping("/pedido/{producto}")
    public String pedido(@PathVariable String producto) {
        return "Preparando tu " + producto + "...";
    }
        @GetMapping("/menu")
    public Map<String, Object> menu() {
        return Map.of(
            "tinto", 3000,
            "capuchino", 6500,
            "chocolate", 5500,
            "pan de bono", 2500
        );
    }

    @GetMapping("/cafeteria gordo")
    public Map<String, Object> cafeteria() {
        return Map.of(
            "nombre", "Café Andino el gordo",
            "ciudad", "Bogotá",
            "abierto", true,
            "horario", "7:00 a.m. a 6:00 p.m."
        );
    }
        @GetMapping("/total/{precio}/{cantidad}")
    public String total(@PathVariable int precio, @PathVariable int cantidad) {
        return "Total a pagar: $" + (precio * cantidad);
    }
}