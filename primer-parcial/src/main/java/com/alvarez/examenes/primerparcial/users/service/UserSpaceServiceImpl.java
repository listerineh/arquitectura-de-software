package com.alvarez.examenes.primerparcial.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvarez.examenes.primerparcial.users.model.User;
import com.alvarez.examenes.primerparcial.users.model.UserSpace;
import com.alvarez.examenes.primerparcial.users.repository.UserSpaceRepository;

@Service
public class UserSpaceServiceImpl implements UserSpaceService {

    @Autowired
    UserSpaceRepository userSpaceRepository;

    @Override
    public List<UserSpace> getAllUserSpaces() {
        return this.userSpaceRepository.findAll();
    }

    @Override
    public List<User> findUsersbySpace(Integer codSpace) {
        return this.userSpaceRepository.findUsersBySpace(codSpace);
    }
}
