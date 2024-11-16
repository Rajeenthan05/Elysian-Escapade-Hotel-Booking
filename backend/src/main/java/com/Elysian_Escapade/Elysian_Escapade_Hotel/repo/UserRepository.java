package com.Elysian_Escapade.Elysian_Escapade_Hotel.repo;

import com.Elysian_Escapade.Elysian_Escapade_Hotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
    boolean existsByEmail(String AAA);

    Optional<User> findByEmail(String email);
}
