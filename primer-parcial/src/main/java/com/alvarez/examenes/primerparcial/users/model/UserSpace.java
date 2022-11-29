package com.alvarez.examenes.primerparcial.users.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "SEG_USUARIO_ESPACIO")
public class UserSpace {

    @EmbeddedId
    private UserSpacePK pk;

    @Column(name = "ROL", nullable = false, length = 3)
    private String role;

    @Column(name = "ESTADO", nullable = false, length = 3)
    private String status;

    public UserSpace(UserSpacePK pk) {
        this.pk = pk;
    }
}
