package com.alvarez.examenes.primerparcial.spaces.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "GDC_ESPACIO_HISTORIAL")
public class SpaceLog {

    @Id
    @Column(name = "COD_ESPACIO_HISTORIAL", nullable = false)
    private Integer codSpaceLog;

    @ManyToOne
    @JoinColumn(name = "COD_ESPACIO", referencedColumnName = "COD_ESPACIO", insertable = false, updatable = false)
    private Space codeSpace;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA", nullable = false)
    private Timestamp date;

    @Column(name = "ACCION", nullable = false, length = 8)
    private String action;

    @Column(name = "USERNAME", nullable = false, length = 32)
    private String username;

    @Column(name = "DESCRIPCION", nullable = false, length = 128)
    private String description;

    public SpaceLog(Integer codSpaceLog) {
        this.codSpaceLog = codSpaceLog;
    }
}
