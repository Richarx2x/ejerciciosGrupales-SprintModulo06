package cl.grupo05.ej3Mod6.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="profesional")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProfessionalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String run;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private UserEntity userEntity;
/*    @Column(name = "usuario_id")
    private String userId;*/

}
