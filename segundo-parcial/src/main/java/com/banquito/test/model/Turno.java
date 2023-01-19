package com.banquito.test.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("turnos")
public class Turno {
    @Id
    private String id;

    private Long numero;
    private String cedulaCliente;
    private String nombreCliente;
    private String codigoEjecutivo;
    private String nombreEjecutivo;
    private Date fechaHoraGeneracion;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;
    private Integer calificacion;
}
