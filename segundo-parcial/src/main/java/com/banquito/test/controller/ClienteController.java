package com.banquito.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.test.model.Cliente;
import com.banquito.test.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/{cedula}")
    public ResponseEntity<Cliente> obtenerClientePorCedula(@PathVariable("cedula") String cedula) {
        return ResponseEntity.ok(this.service.getByCedula(cedula));
    }
}
