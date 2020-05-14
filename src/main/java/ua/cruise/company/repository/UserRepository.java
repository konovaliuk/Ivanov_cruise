package ua.cruise.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import ua.cruise.company.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
