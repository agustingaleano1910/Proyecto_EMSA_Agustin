package ar.edu.itec.Proyecto_EMSA.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "consumo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fecha;
    private Double subTotal;
    private Double total;

    @ManyToOne
    @JoinColumn(name = "medidor_id")
    private Medidor medidor;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "consumo")
    private List<LineaConsumo> lineasConsumo;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "consumo")
    private List<LineaImpuesto> lineasImpuesto;
}