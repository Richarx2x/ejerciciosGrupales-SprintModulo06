package cl.grupo05.ej3Mod6.model.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="administrativo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdministrativeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String run;
    private String nombre;
    private String apellido;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private UserEntity userEntity;
  /*  @Column(name = "usuario_id")
    private int userId;*/
}
