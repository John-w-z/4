package com.chilis.proyecto.dto;

import lombok.Data;

@Data
public class ConfiguracionAlertasRequestDto {
    // # Función: Permite configurar los umbrales de tiempo (en minutos) 
    // # para la semaforización de demoras en cocina 
    // # (alerta amarilla de advertencia y alerta roja crítica) (RF-12 / ECU-02).
    private Integer tiempoAmarilloMinutos;
    private Integer tiempoRojoMinutos;
}