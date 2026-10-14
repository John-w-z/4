package com.chilis.proyecto.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class AperturaTurnoCajaDto {
    // # Función: Registra el fondo de dinero en efectivo inicial (sencillo) 
    // # para abrir formalmente las operaciones de caja del día (RF-28 / ECU-01).
    private Integer idUsuario;
    private BigDecimal montoInicial;
}