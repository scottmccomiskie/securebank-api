package com.scott.user_registration_api.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//Repository Go to database and look for a user

// The repository already knows about the User entity because of thie line
public interface UserRepository extends JpaRepository<User, Long>{

    // find a user by email
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);


}
