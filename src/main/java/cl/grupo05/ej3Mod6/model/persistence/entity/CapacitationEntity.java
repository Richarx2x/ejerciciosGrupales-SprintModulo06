package cl.grupo05.ej3Mod6.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name="capacitacion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CapacitationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private Date fecha;
    private String hora;
    private String lugar;
    // private Double duracion;
    // private int cantidad;
    // @Column(name="cliente_id")
    // private int clienteId;
/*    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private ClienteDTO cliente;*/


}
