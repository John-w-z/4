package com.chilis.proyecto.controller;

import com.chilis.proyecto.dto.ListaEsperaRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/espera")
public class ListaEsperaController {

    // Registrar cliente en lista de espera y asignar localizador (RF-29 / ECU-03)
    @PostMapping("/registrar")
    public ResponseEntity<?> registrarEnEspera(@RequestBody ListaEsperaRequestDto request) {
        return ResponseEntity.ok("Cliente agregado a la lista de espera digital con tiempo estimado calculado");
    }
}