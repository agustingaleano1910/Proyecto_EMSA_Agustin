package ar.edu.itec.Proyecto_EMSA.repository;

import ar.edu.itec.Proyecto_EMSA.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByName(String name);
}
