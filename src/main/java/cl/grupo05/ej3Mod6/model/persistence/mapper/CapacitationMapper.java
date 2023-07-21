package cl.grupo05.ej3Mod6.model.persistence.mapper;


import cl.grupo05.ej3Mod6.model.domain.dto.CapacitationDTO;
import cl.grupo05.ej3Mod6.model.persistence.entity.CapacitationEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CapacitationMapper {

    @Mappings({
            @Mapping(source= "id", target= "id"),
            @Mapping(source= "nombre", target= "name"),
            @Mapping(source = "fecha", target= "capacitationDate"),
            @Mapping(source = "hora", target= "hour"),
            @Mapping(source = "lugar", target= "place"),

    })
    CapacitationDTO toCapacitationDTO(CapacitationEntity capacitation);
    List<CapacitationDTO> toCapacitationsDTO(List<CapacitationEntity> capacitations);
    @InheritInverseConfiguration
    CapacitationEntity toCapacitationEntity(CapacitationDTO capacitation);
}
