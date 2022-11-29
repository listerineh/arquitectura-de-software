package com.alvarez.examenes.primerparcial.spaces.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarez.examenes.primerparcial.spaces.model.SpaceLog;
import com.alvarez.examenes.primerparcial.spaces.repository.SpaceLogRepository;

@Service
public class SpaceLogServiceImpl implements SpaceLogService {

    @Autowired
    SpaceLogRepository spaceLogRepository;

    @Override
    public List<SpaceLog> getAllSpaceLogs() {
        return this.spaceLogRepository.findAll();
    }
}
