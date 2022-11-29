package com.alvarez.examenes.primerparcial.spaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarez.examenes.primerparcial.spaces.service.SpaceService;

@RestController
@RequestMapping("/space")
public class SpaceController {

    @Autowired
    SpaceService spaceService;

    @GetMapping("/all")
    public Object getAllSpaces() {
        return this.spaceService.getAllSpaces();
    }
}
