package com.banquito.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banquito.test.model.Test;
import com.banquito.test.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Iterable<Test>> getAll() {
        return ResponseEntity.ok(this.service.getAll());
    }
}
