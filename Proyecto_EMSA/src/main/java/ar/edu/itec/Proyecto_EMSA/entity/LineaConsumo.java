package ar.edu.itec.Proyecto_EMSA.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "linea_consumo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LineaConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double cantidad;

    @ManyToOne
    @JoinColumn(name = "consumo_id")
    private Consumo consumo;

    @ManyToOne
    @JoinColumn(name = "tipo_consumo_id")
    private TipoConsumo tipoConsumo;
}