package com.banquito.test.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.banquito.test.model.Ejecutivo;
import com.banquito.test.model.Turno;
import com.banquito.test.repository.EjecutivoRepository;
import com.banquito.test.repository.TurnoRepository;

@Service
public class EjecutivoService {
    private final EjecutivoRepository repository;
    private final TurnoRepository turnoRepository;

    public EjecutivoService(EjecutivoRepository repository, TurnoRepository turnoRepository) {
        this.repository = repository;
        this.turnoRepository = turnoRepository;
    }

    @Transactional
    public Turno iniciarTurno(Long numeroTurno, String codigoEjecutivo) {
        Turno turno = turnoRepository.findByNumero(numeroTurno);
        Ejecutivo ejecutivo = repository.findByCodigo(codigoEjecutivo);

        Turno turnoIniciado = Turno.builder()
                .id(turno.getId())
                .numero(turno.getNumero())
                .cedulaCliente(turno.getCedulaCliente())
                .nombreCliente(turno.getNombreCliente())
                .fechaHoraGeneracion(turno.getFechaHoraGeneracion())
                .codigoEjecutivo(ejecutivo.getCodigo())
                .nombreEjecutivo(ejecutivo.getNombreCompleto())
                .fechaHoraInicio(new Date())
                .build();

        this.turnoRepository.save(turnoIniciado);

        return turnoIniciado;
    }

    @Transactional
    public Turno finalizarTurno(Long numeroTurno) {
        Turno turno = turnoRepository.findByNumero(numeroTurno);

        Turno turnoFinalizado = Turno.builder()
                .id(turno.getId())
                .numero(turno.getNumero())
                .cedulaCliente(turno.getCedulaCliente())
                .nombreCliente(turno.getNombreCliente())
                .fechaHoraGeneracion(turno.getFechaHoraGeneracion())
                .codigoEjecutivo(turno.getCodigoEjecutivo())
                .nombreEjecutivo(turno.getNombreEjecutivo())
                .fechaHoraInicio(turno.getFechaHoraInicio())
                .fechaHoraFin(new Date())
                .build();

        this.turnoRepository.save(turnoFinalizado);

        return turnoFinalizado;
    }
}
