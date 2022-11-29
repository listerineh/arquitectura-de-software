package com.alvarez.examenes.primerparcial.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alvarez.examenes.primerparcial.users.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByStatus(String status);
}
