package cl.grupo05.ej3Mod6.model.persistence.mapper;

import cl.grupo05.ej3Mod6.model.domain.dto.CustomerDTO;
import cl.grupo05.ej3Mod6.model.persistence.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CustomerrMapper {

    @Mappings({
            @Mapping(source= "id", target= "id"),
            @Mapping(source= "rut", target= "rut"),
            @Mapping(source = "nombre", target= "name"),
            @Mapping(source = "apellido", target= "lastname"),
            @Mapping(source = "correo", target= "email"),
            @Mapping(source = "telefono", target= "phone"),
            @Mapping(source = "edad", target= "age"),
            @Mapping(source = "userEntity", target= "userDTO"),

    })
    CustomerDTO toCustomerDTO(CustomerEntity customer);
    List<CustomerDTO> toCustomersDTO(List<CustomerEntity> customers);
    @InheritInverseConfiguration
    CustomerEntity toCustomerEntity(CustomerDTO customer);

}
