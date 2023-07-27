package cl.grupo05.ej3Mod6.model.domain.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomerDTO {
    private int id;
    private String rut;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private int age;
    private UserDTO userDTO;
    // private int userId;

}
