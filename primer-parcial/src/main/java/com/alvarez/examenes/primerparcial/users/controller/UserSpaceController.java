package com.alvarez.examenes.primerparcial.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarez.examenes.primerparcial.users.service.UserSpaceService;

@RestController
@RequestMapping("/userspace")
public class UserSpaceController {

    @Autowired
    UserSpaceService userSpaceService;

    @GetMapping("/all")
    public Object getAllUserSpaces() {
        return this.userSpaceService.getAllUserSpaces();
    }

    @GetMapping("/{codSpace}")
    public Object getUsersBySpace(@PathVariable("codSpace") Integer codSpace) {
        return this.userSpaceService.findUsersbySpace(codSpace);
    }
}
