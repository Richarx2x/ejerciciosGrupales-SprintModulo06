package cl.grupo05.ej3Mod6.model.domain.service;

import cl.grupo05.ej3Mod6.model.domain.dto.CapacitationDTO;
import cl.grupo05.ej3Mod6.model.persistence.mapper.CapacitationMapper;
import cl.grupo05.ej3Mod6.model.persistence.repository.CapacitationRepository;
import cl.grupo05.ej3Mod6.web.service.CapacitationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitationServiceImpl implements CapacitationService {

    private final CapacitationRepository repository;
    private final CapacitationMapper mapper;

    public CapacitationServiceImpl(CapacitationRepository repository, CapacitationMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CapacitationDTO> findAll(){
        return mapper.toCapacitationsDTO(repository.findAll());
    }

/*    @Override
    public List<CapacitationDTO> findAll(){
        List<CapacitationDTO> capacitaciones = mapper.toCapacitationsDTO(repository.findAll());
        System.out.println(capacitaciones);
        return capacitaciones;
    }*/


    @Override
    public CapacitationDTO findById(int id) {
        return null;
    }


}
