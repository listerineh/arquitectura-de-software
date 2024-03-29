package com.alvarez.examenes.primerparcial.users.service;

import java.util.List;

import com.alvarez.examenes.primerparcial.users.model.User;
import com.alvarez.examenes.primerparcial.users.model.UserSpace;

public interface UserSpaceService {
    List<UserSpace> getAllUserSpaces();

    List<User> findUsersbySpace(Integer codSpace);
}
