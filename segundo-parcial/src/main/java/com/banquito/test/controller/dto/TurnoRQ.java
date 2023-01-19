package com.banquito.test.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TurnoRQ {
    private String cedula;
    private String nombres;
    private String apellidos;
}
