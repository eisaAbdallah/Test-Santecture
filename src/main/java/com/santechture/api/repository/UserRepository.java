package com.santechture.api.repository;

import com.santechture.api.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    boolean existsByUsernameIgnoreCase(String username);
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    boolean existsByEmailIgnoreCase(String email);
}
