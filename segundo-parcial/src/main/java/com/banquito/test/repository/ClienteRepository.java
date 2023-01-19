package com.banquito.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.banquito.test.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {
    public Cliente findByCedula(String cedula);
}
