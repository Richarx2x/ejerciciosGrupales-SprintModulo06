package cl.grupo05.ej3Mod6.model.domain.dto;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdministrativeDTO {
    private int id;
    private String run;
    private String name;
    private String lastname;
    private int userId;

    @Override
    public String toString() {
        return "AdministrativeDTO{" +
                "id=" + id +
                ", run=" + run +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userId=" + userId +
                '}';
    }
}
