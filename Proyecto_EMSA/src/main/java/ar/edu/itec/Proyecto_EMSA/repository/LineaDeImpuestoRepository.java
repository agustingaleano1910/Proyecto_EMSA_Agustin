package ar.edu.itec.Proyecto_EMSA.repository;

import ar.edu.itec.Proyecto_EMSA.entity.LineaImpuesto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineaDeImpuestoRepository extends JpaRepository<LineaImpuesto, Integer> {
}
