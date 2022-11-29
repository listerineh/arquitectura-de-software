package com.alvarez.examenes.primerparcial.users.model;

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
@Table(name = "SEG_USER")
public class User {

    @Id
    @Column(name = "COD_USER", nullable = false)
    private Integer codUser;

    @Column(name = "USERNAME", nullable = false, length = 32)
    private String username;

    @Column(name = "NAME", nullable = false, length = 128)
    private String name;

    @Column(name = "EMAIL", nullable = false, length = 128)
    private String email;

    @Column(name = "STATUS", nullable = false, length = 3)
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE", nullable = false)
    private Timestamp creationDate;

    public User(Integer codUser) {
        this.codUser = codUser;
    }
}
