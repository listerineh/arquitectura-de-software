package com.banquito.test.service;

import org.springframework.stereotype.Service;

import com.banquito.test.model.Cliente;
import com.banquito.test.repository.ClienteRepository;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente getByCedula(String cedula) {
        return this.repository.findByCedula(cedula);
    }
}
