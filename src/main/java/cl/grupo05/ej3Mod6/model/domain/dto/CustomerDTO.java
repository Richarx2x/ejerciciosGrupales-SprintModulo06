package cl.grupo05.ej3Mod6.model.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDTO {
    private int id;
    private String rut;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private int age;
    private int userId;

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", userId=" + userId +
                '}';
    }
}
