package com.banquito.test.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banquito.test.model.Turno;
import com.banquito.test.repository.TurnoRepository;

@Service
public class TurnoService {
    private final TurnoRepository repository;

    public TurnoService(TurnoRepository repository) {
        this.repository = repository;
    }

    public Turno crearTurno(String cedula, String nombres, String apellidos) {
        Long siguienteTurno = repository.findAll().spliterator().getExactSizeIfKnown() + 1;

        return Turno.builder()
                .numero(siguienteTurno)
                .cedulaCliente(cedula)
                .nombreCliente(nombres + " " + apellidos)
                .fechaHoraGeneracion(new Date())
                .build();
    }

    @Transactional
    public Turno calificarTurno(String cedula, Long numeroTurno, Integer calificacion) {
        Turno turno = repository.findByNumero(numeroTurno);

        if (cedula != turno.getCedulaCliente())
            return null;

        return Turno.builder()
                .numero(turno.getNumero())
                .cedulaCliente(turno.getCedulaCliente())
                .nombreCliente(turno.getNombreCliente())
                .fechaHoraGeneracion(turno.getFechaHoraGeneracion())
                .codigoEjecutivo(turno.getCodigoEjecutivo())
                .nombreEjecutivo(turno.getNombreEjecutivo())
                .fechaHoraInicio(turno.getFechaHoraInicio())
                .fechaHoraFin(turno.getFechaHoraFin())
                .calificacion(calificacion)
                .build();
    }
}
