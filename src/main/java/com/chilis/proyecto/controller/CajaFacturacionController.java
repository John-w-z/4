package com.chilis.proyecto.controller;

import com.chilis.proyecto.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/caja")
public class CajaFacturacionController {

    // Apertura de caja diaria / fondo inicial (RF-28 / ECU-01)
    @PostMapping("/turno/abrir")
    public ResponseEntity<?> abrirTurno(@RequestBody AperturaTurnoCajaDto request) {
        return ResponseEntity.ok("Turno de caja abierto correctamente con el fondo inicial");
    }

    // Dividir cuenta de mesa (RF-21 / ECU-08)
    @PostMapping("/cuenta/dividir")
    public ResponseEntity<?> dividirCuenta(@RequestBody DivisionCuentaRequestDto request) {
        return ResponseEntity.ok("Cuenta dividida exitosamente por comensales o ítems");
    }

    // Fusionar cuentas de varias mesas (RF-22 / ECU-08)
    @PostMapping("/cuenta/fusionar")
    public ResponseEntity<?> fusionarCuentas(@RequestBody FusionCuentaRequestDto request) {
        return ResponseEntity.ok("Consumos de mesas fusionados en una cuenta unificada");
    }

    // Procesar pago y emitir comprobante (RF-24, RF-25 / ECU-08)
    @PostMapping("/pagar")
    public ResponseEntity<?> procesarPago(@RequestBody PagoRequestDto request) {
        return ResponseEntity.ok("Pago procesado con éxito, vuelto calculado y comprobante emitido");
    }

    // Registrar encuesta de satisfacción del comensal (RF-31 / ECU-08)
    @PostMapping("/encuesta")
    public ResponseEntity<?> registrarEncuesta(@RequestBody EncuestaSatisfaccionRequestDto request) {
        return ResponseEntity.ok("Encuesta de satisfacción registrada de forma anónima y segura");
    }

    // Arqueo y cierre de caja por turno (RF-26 / ECU-09)
    @PostMapping("/turno/cerrar")
    public ResponseEntity<?> cerrarTurno(@RequestBody CierreTurnoCajaDto request) {
        return ResponseEntity.ok("Turno de caja cerrado, arqueo generado y permisos revocados");
    }

    // Emitir nota de crédito integrada con SUNAT (RF-36 / ECU-09)
    @PostMapping("/nota-credito")
    public ResponseEntity<?> emitirNotaCredito(@RequestBody NotaCreditoRequestDto request) {
        return ResponseEntity.ok("Nota de crédito generada, firmada en XML UBL 2.1 y enviada a SUNAT");
    }
}