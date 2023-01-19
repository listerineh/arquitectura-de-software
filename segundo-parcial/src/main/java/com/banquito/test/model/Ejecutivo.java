package com.banquito.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("ejecutivos")
public class Ejecutivo {
    @Id
    private String id;

    private String codigo;
    private String nombreCompleto;
    private String numeroEscritorioAsignado;
}
