package cl.grupo05.ej3Mod6.model.persistence.mapper;

import cl.grupo05.ej3Mod6.model.domain.dto.CapacitationDTO;
import cl.grupo05.ej3Mod6.model.persistence.entity.CapacitationEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-21T12:11:53-0400",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class CapacitationMapperImpl implements CapacitationMapper {

    @Override
    public CapacitationDTO toCapacitationDTO(CapacitationEntity capacitation) {
        if ( capacitation == null ) {
            return null;
        }

        CapacitationDTO capacitationDTO = new CapacitationDTO();

        capacitationDTO.setId( capacitation.getId() );
        capacitationDTO.setName( capacitation.getNombre() );
        capacitationDTO.setCapacitationDate( capacitation.getFecha() );
        capacitationDTO.setHour( capacitation.getHora() );
        capacitationDTO.setPlace( capacitation.getLugar() );

        return capacitationDTO;
    }

    @Override
    public List<CapacitationDTO> toCapacitationsDTO(List<CapacitationEntity> capacitations) {
        if ( capacitations == null ) {
            return null;
        }

        List<CapacitationDTO> list = new ArrayList<CapacitationDTO>( capacitations.size() );
        for ( CapacitationEntity capacitationEntity : capacitations ) {
            list.add( toCapacitationDTO( capacitationEntity ) );
        }

        return list;
    }

    @Override
    public CapacitationEntity toCapacitationEntity(CapacitationDTO capacitation) {
        if ( capacitation == null ) {
            return null;
        }

        CapacitationEntity capacitationEntity = new CapacitationEntity();

        capacitationEntity.setId( capacitation.getId() );
        capacitationEntity.setNombre( capacitation.getName() );
        capacitationEntity.setFecha( capacitation.getCapacitationDate() );
        capacitationEntity.setHora( capacitation.getHour() );
        capacitationEntity.setLugar( capacitation.getPlace() );

        return capacitationEntity;
    }
}
