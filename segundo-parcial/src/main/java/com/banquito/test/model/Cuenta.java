package com.banquito.test.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cuenta {
    private String numero;
    private String tipo;
    private Double saldoPromedio;
}
