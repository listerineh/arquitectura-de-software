package com.alvarez.examenes.primerparcial.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarez.examenes.primerparcial.users.model.User;
import com.alvarez.examenes.primerparcial.users.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public List<User> findByStatus(String status) {
        return this.userRepository.findByStatus(status);
    }
}
