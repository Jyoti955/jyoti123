package com.auth.simple.repositary;

import com.auth.simple.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User ,Integer> {
    Optional<User> findUserByUsername(String name);
}
