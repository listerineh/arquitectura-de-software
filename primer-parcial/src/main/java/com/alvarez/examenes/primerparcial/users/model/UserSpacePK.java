package com.alvarez.examenes.primerparcial.users.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class UserSpacePK implements Serializable {

    @Column(name = "COD_ESPACIO", nullable = false)
    private Integer codSpace;

    @Column(name = "COD_USER", nullable = false)
    private Integer codUser;
}
