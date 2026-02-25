package com.stockwave.simulator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.stockwave.simulator.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
