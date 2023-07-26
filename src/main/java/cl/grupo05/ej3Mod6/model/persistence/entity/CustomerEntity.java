package cl.grupo05.ej3Mod6.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cliente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private int edad;
    @ManyToOne(fetch=FetchType.LAZY)
    private UserEntity userEntity;
/*    @Column(name = "usuario_id")
    private int userId;*/


}
