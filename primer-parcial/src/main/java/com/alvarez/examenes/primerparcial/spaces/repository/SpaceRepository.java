package com.alvarez.examenes.primerparcial.spaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alvarez.examenes.primerparcial.spaces.model.Space;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Integer> {

}
