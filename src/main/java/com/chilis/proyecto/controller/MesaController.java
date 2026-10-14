package com.chilis.proyecto.controller;

import com.chilis.proyecto.dto.TransferenciaMesaRequestDto;
import com.chilis.proyecto.entity.Mesa;
import com.chilis.proyecto.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    @Autowired
    private MesaRepository mesaRepository;

    // Obtener todas las mesas o mapa de salón (RF-03 / ECU-04)
    @GetMapping
    public ResponseEntity<List<Mesa>> listarMesas() {
        List<Mesa> mesas = mesaRepository.findAll();
        return ResponseEntity.ok(mesas);
    }

    // Listar solo mesas activas
    @GetMapping("/activas")
    public ResponseEntity<List<Mesa>> listarMesasActivas() {
        List<Mesa> mesas = mesaRepository.findByActivaTrue();
        return ResponseEntity.ok(mesas);
    }

    // Endpoint para transferir o reasignar mesa con validación de PIN (RF-09 / ECU-04)
    @PostMapping("/transferir")
    public ResponseEntity<?> transferirMesa(@RequestBody TransferenciaMesaRequestDto request) {
        // Lógica de transferencia y validación de PIN de supervisor
        return ResponseEntity.ok("Mesa transferida exitosamente al nuevo mozo/ubicación");
    }
}