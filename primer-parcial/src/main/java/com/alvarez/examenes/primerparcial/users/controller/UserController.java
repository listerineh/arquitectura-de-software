package com.alvarez.examenes.primerparcial.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvarez.examenes.primerparcial.users.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public Object getAllUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping("/{status}")
    public Object readUsersByStatus(@PathVariable("status") String status) {
        return this.userService.findByStatus(status);
    }
}
