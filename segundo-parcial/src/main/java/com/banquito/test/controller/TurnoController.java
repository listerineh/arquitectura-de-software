package com.banquito.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.test.controller.dto.TurnoCrear;
import com.banquito.test.model.Turno;
import com.banquito.test.service.EjecutivoService;
import com.banquito.test.service.TurnoService;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {
    private final TurnoService service;
    private final EjecutivoService ejecutivoService;

    public TurnoController(TurnoService service, EjecutivoService ejecutivoService) {
        this.service = service;
        this.ejecutivoService = ejecutivoService;
    }

    @PostMapping
    public ResponseEntity<Turno> crearTurno(@RequestBody TurnoCrear turno) {
        Turno nuevoTurno = this.service.crearTurno(turno.getCedula(), turno.getNombres(), turno.getApellidos());

        return ResponseEntity.ok(nuevoTurno);
    }

    @GetMapping("/{numero}")
    public ResponseEntity<Turno> obtenerTurnoPorNumero(@PathVariable Long numero) {
        Turno turno = this.service.obtenerTurnoPorNumero(numero);

        return ResponseEntity.ok(turno);
    }

    @PutMapping("/iniciar/{numeroTurno}/ejecutivo/{codigoEjecutivo}")
    public ResponseEntity<Turno> iniciarTurno(@PathVariable Long numeroTurno, @PathVariable String codigoEjecutivo) {
        Turno turnoIniciado = this.ejecutivoService.iniciarTurno(numeroTurno, codigoEjecutivo);

        return ResponseEntity.ok(turnoIniciado);
    }

    @PutMapping("/finalizar/{numeroTurno}")
    public ResponseEntity<Turno> finalizarTurno(@PathVariable Long numeroTurno) {
        Turno turnoFinalizado = this.ejecutivoService.finalizarTurno(numeroTurno);

        return ResponseEntity.ok(turnoFinalizado);
    }

    @PutMapping("calificar/{numeroTurno}/cedula/{cedula}/calificacion/{calificacion}")
    public ResponseEntity<Turno> calificarTurno(
            @PathVariable Long numeroTurno,
            @PathVariable String cedula,
            @PathVariable Integer calificacion) {
        Turno turnoCalificado = this.service.calificarTurno(cedula, numeroTurno, calificacion);

        return ResponseEntity.ok(turnoCalificado);
    }
}
