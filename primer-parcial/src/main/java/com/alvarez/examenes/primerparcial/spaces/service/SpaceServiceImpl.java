package com.alvarez.examenes.primerparcial.spaces.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarez.examenes.primerparcial.spaces.model.Space;
import com.alvarez.examenes.primerparcial.spaces.repository.SpaceRepository;

@Service
public class SpaceServiceImpl implements SpaceService {

    @Autowired
    SpaceRepository spaceRepository;

    @Override
    public List<Space> getAllSpaces() {
        return this.spaceRepository.findAll();
    }
}
