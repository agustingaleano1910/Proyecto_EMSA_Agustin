package ar.edu.itec.Proyecto_EMSA.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "cliente")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String nombre;
        private String apellido;
        private String dni;
        private String direccion;

        @ManyToOne
        @JoinColumn(name = "tipo_iva_id")
        private TipoIva tipoIva;

        @ToString.Exclude
        @EqualsAndHashCode.Exclude
        @OneToMany(mappedBy = "cliente")
        private List<Medidor> medidores;

        @ToString.Exclude
        @EqualsAndHashCode.Exclude
        @OneToOne(mappedBy = "cliente")
        private User user;
}