package com.chilis.proyecto.dto;

import lombok.Data;

@Data
public class ActualizarEstadoComandaDto {
    // # Función: Utilizado por el personal de cocina en el KDS para cambiar 
    // # el estado de preparación de un plato (Recibido, En Preparación, Listo, Retirado) (RF-13 / ECU-06).
    private Integer idDetalle;
    private String estadoPreparacion; 
}