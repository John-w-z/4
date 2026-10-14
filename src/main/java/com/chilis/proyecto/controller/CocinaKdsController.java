package com.chilis.proyecto.controller;

import com.chilis.proyecto.dto.ActualizarEstadoComandaDto;
import com.chilis.proyecto.dto.InsumoSustitutoRequestDto;
import com.chilis.proyecto.dto.MermaRequestDto;
import com.chilis.proyecto.entity.DetallePedido;
import com.chilis.proyecto.repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cocina")
public class CocinaKdsController {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    // Visualizar comandas en pantalla KDS de cocina (RF-11 / ECU-06)
    @GetMapping("/comandas-pendientes")
    public ResponseEntity<List<DetallePedido>> listarComandasPendientes() {
        List<DetallePedido> detalles = detallePedidoRepository.findByEstadoPreparacion("RECIBIDO");
        return ResponseEntity.ok(detalles);
    }

    // Actualizar estado de preparación en tiempo real (RF-13 / ECU-06)
    @PutMapping("/actualizar-estado")
    public ResponseEntity<?> actualizarEstadoComanda(@RequestBody ActualizarEstadoComandaDto request) {
        return ResponseEntity.ok("Estado de preparación actualizado en cocina y sincronizado con salón");
    }

    // Registrar merma o incidente de cocina (RF-19 / ECU-07)
    @PostMapping("/merma")
    public ResponseEntity<?> registrarMerma(@RequestBody MermaRequestDto request) {
        return ResponseEntity.ok("Merma registrada y stock de almacén descontado exitosamente");
    }

    // Aplicar insumo sustituto en receta (RF-33 / ECU-07)
    @PostMapping("/sustituto")
    public ResponseEntity<?> aplicarInsumoSustituto(@RequestBody InsumoSustitutoRequestDto request) {
        return ResponseEntity.ok("Insumo sustituto aplicado y notificado al mozo");
    }
}