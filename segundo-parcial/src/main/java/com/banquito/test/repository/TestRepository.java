package com.banquito.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.banquito.test.model.Test;

public interface TestRepository extends CrudRepository<Test, String> {

}
