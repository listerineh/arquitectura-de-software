package com.banquito.test.service;

import org.springframework.stereotype.Service;

import com.banquito.test.model.Test;
import com.banquito.test.repository.TestRepository;

@Service
public class TestService {
    private final TestRepository repository;

    public TestService(TestRepository repository) {
        this.repository = repository;
    }

    public Iterable<Test> getAll() {
        return this.repository.findAll();
    }
}
