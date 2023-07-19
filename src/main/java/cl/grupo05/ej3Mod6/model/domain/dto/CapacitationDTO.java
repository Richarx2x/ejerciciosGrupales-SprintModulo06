package cl.grupo05.ej3Mod6.model.domain.dto;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CapacitationDTO {
    private int id;
    private String name;
    private Date capacitationDate;
    private String hour;
    private String place;
}
