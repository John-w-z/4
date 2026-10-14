package com.chilis.proyecto.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CierreTurnoCajaDto {
    // # Función: Recoge el monto físico contado al finalizar el turno 
    // # para realizar el arqueo de caja y calcular posibles sobrantes o faltantes (RF-26 / ECU-09).
    private Integer idTurno;
    private BigDecimal montoFinalContado;
    private String observacionCierre;
}