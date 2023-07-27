package cl.grupo05.ej3Mod6.model.persistence.mapper;

import cl.grupo05.ej3Mod6.model.domain.dto.UserDTO;
import cl.grupo05.ej3Mod6.model.persistence.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source= "id", target= "id"),
            @Mapping(source= "nombre", target= "name"),
            @Mapping(source = "username", target= "username"),
            @Mapping(source = "password", target= "password"),

    })
    UserDTO toUserDTO(UserEntity user);
    List<UserDTO> toUsersDTO(List<UserEntity> users);
    @InheritInverseConfiguration
    UserEntity toUserEntity(UserDTO user);
}
