package cl.grupo05.ej3Mod6.model.persistence.mapper;



import cl.grupo05.ej3Mod6.model.domain.dto.ProfessionalDTO;
import cl.grupo05.ej3Mod6.model.persistence.entity.ProfessionalEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ProfessionalMapper {

    @Mappings({
            @Mapping(source= "id", target= "id"),
            @Mapping(source= "run", target= "run"),
            @Mapping(source = "nombre", target= "name"),
            @Mapping(source = "apellido", target= "lastname"),
            @Mapping(source = "correo", target= "email"),
            @Mapping(source = "telefono", target= "phone"),
            @Mapping(source = "userEntity", target= "userDTO"),

    })
    ProfessionalDTO toProfessionalDTO(ProfessionalEntity professional);
    List<ProfessionalDTO> toProfessionalsDTO(List<ProfessionalEntity> professionals);
    @InheritInverseConfiguration
    ProfessionalEntity toProfessionalEntity(ProfessionalDTO professional);
}
