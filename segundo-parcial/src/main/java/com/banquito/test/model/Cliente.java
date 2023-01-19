package com.banquito.test.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;

    private String cedula;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccionPrincipal;
    private String telefono;
    private String correo;
    private List<Cuenta> cuentas;
}
