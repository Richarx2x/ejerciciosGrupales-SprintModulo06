package cl.grupo05.ej3Mod6.model.persistence.mapper;


import cl.grupo05.ej3Mod6.model.domain.dto.AdministrativeDTO;
import cl.grupo05.ej3Mod6.model.persistence.entity.AdministrativeEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface AdministrativeMapper {

    @Mappings({
            @Mapping(source= "id", target= "id"),
            @Mapping(source= "run", target= "run"),
            @Mapping(source = "nombre", target= "name"),
            @Mapping(source = "apellido", target= "lastname"),
            @Mapping(source = "userEntity", target= "userDTO"),

    })
    AdministrativeDTO toAdministrativeDTO(AdministrativeEntity administrative);
    List<AdministrativeDTO> toAdministrativesDTO(List<AdministrativeEntity> administratives);
    @InheritInverseConfiguration
    AdministrativeEntity toAdministrativeEntity(AdministrativeDTO administrative);
}
