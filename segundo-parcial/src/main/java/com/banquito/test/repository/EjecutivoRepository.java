package com.banquito.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.banquito.test.model.Ejecutivo;

public interface EjecutivoRepository extends CrudRepository<Ejecutivo, String> {
    public Ejecutivo findByCodigo(String codigo);
}
