package com.banquito.test.controller.mapper;

import com.banquito.test.controller.dto.TurnoRQ;
import com.banquito.test.model.Turno;

public class TurnoMapper {
    public static Turno toTurno(TurnoRQ turnoRQ) {
        return Turno.builder()
                .cedulaCliente(turnoRQ.getCedula())
                .nombreCliente(turnoRQ.getNombres() + " " + turnoRQ.getApellidos())
                .build();
    }
}
