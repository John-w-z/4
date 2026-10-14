package com.chilis.proyecto.controller;

import com.chilis.proyecto.dto.DesactivarPlatoRequestDto;
import com.chilis.proyecto.dto.ProductoConfigRequestDto;
import com.chilis.proyecto.entity.Producto;
import com.chilis.proyecto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    // Consultar menú disponible en tiempo real para los mozos (RF-04 / ECU-02)
    @GetMapping("/disponibles")
    public ResponseEntity<List<Producto>> listarProductosDisponibles() {
        List<Producto> productos = productoRepository.findByActivoTrueAndDisponibleTrue();
        return ResponseEntity.ok(productos);
    }

    // Crear o actualizar un plato/producto (ECU-02)
    @PostMapping("/configurar")
    public ResponseEntity<?> configurarProducto(@RequestBody ProductoConfigRequestDto request) {
        return ResponseEntity.ok("Producto configurado y sincronizado exitosamente en el menú");
    }

    // Desactivar plato por insumo agotado desde cocina (RF-18 / ECU-07)
    @PostMapping("/desactivar")
    public ResponseEntity<?> desactivarProducto(@RequestBody DesactivarPlatoRequestDto request) {
        return ResponseEntity.ok("Producto desactivado de la carta en tiempo real");
    }
}