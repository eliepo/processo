package com.promad.test.processo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promad.test.processo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
