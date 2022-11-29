package com.alvarez.examenes.primerparcial.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alvarez.examenes.primerparcial.users.model.User;
import com.alvarez.examenes.primerparcial.users.model.UserSpace;
import com.alvarez.examenes.primerparcial.users.model.UserSpacePK;

@Repository
public interface UserSpaceRepository extends JpaRepository<UserSpace, UserSpacePK> {
    List<User> findUsersBySpace(Integer codSpace);
}
