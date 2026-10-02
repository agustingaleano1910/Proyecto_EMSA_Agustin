package ar.edu.itec.Proyecto_EMSA.repository;

import ar.edu.itec.Proyecto_EMSA.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
