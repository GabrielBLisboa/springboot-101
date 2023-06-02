package com.springtest.userdept.repositories;

import com.springtest.userdept.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
