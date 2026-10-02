package ar.edu.itec.Proyecto_EMSA.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "linea_impuesto")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LineaImpuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double cantidad;
    private Double porcentaje;

    @ManyToOne
    @JoinColumn(name = "consumo_id")
    private Consumo consumo;

    @ManyToOne
    @JoinColumn(name = "impuesto_id")
    private Impuesto impuesto;
}