package com.alvarez.examenes.primerparcial.spaces.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO")
public class Space {

    @Id
    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer codSpace;

    @Column(name = "NOMBRE", nullable = false, length = 128)
    private String name;

    @Column(name = "DESCRIPCION", nullable = false, length = 500)
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CREACION", nullable = false)
    private Timestamp creationDate;

    @Column(name = "VISIBILIDAD", nullable = false, length = 3)
    private String Visiility;

    public Space(Integer codSpace) {
        this.codSpace = codSpace;
    }
}
