package com.banquito.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.test.controller.dto.TurnoRQ;
import com.banquito.test.model.Turno;
import com.banquito.test.service.TurnoService;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {
    private final TurnoService service;

    public TurnoController(TurnoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Turno> crearTurno(@RequestBody TurnoRQ turnoRQ) {
        Turno nuevoTurno = this.service.crearTurno(turnoRQ.getCedula(), turnoRQ.getNombres(), turnoRQ.getApellidos());

        return ResponseEntity.ok(nuevoTurno);
    }
}
