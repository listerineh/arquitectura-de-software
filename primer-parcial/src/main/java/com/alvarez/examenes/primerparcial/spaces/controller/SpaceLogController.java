package com.alvarez.examenes.primerparcial.spaces.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarez.examenes.primerparcial.spaces.service.SpaceLogService;

@RestController
@RequestMapping("/spacelog")
public class SpaceLogController {

    @Autowired
    SpaceLogService spaceLogService;

    @GetMapping("/all")
    public Object getAllSpaceLogs() {
        return this.spaceLogService.getAllSpaceLogs();
    }

}
