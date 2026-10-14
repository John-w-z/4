package com.chilis.proyecto.controller;

import com.chilis.proyecto.dto.PedidoRequestDto;
import com.chilis.proyecto.entity.Pedido;
import com.chilis.proyecto.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    // Registrar comanda desde la tablet del mozo (RF-02 / ECU-05)
    @PostMapping("/crear")
    public ResponseEntity<?> crearPedido(@RequestBody PedidoRequestDto request) {
        // Aquí se procesará la creación del pedido y su transmisión a cocina
        return ResponseEntity.ok("Comanda registrada y enviada exitosamente a cocina");
    }

    // Listar pedidos por estado
    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<Pedido>> listarPorEstado(@PathVariable String estado) {
        List<Pedido> pedidos = pedidoRepository.findByEstado(estado);
        return ResponseEntity.ok(pedidos);
    }
}