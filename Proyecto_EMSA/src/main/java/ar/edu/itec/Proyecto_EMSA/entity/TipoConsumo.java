package ar.edu.itec.Proyecto_EMSA.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tipo_consumo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descripcion;
    private Double precio;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "tipoConsumo")
    private List<LineaConsumo> lineasConsumo;
}