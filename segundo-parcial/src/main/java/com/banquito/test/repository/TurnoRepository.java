package com.banquito.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.banquito.test.model.Turno;

public interface TurnoRepository extends CrudRepository<Turno, String> {
    public Turno findByNumero(Long numero);
}
