package cl.grupo05.ej3Mod6.model.domain.service;


import cl.grupo05.ej3Mod6.model.domain.dto.ProfessionalDTO;
import cl.grupo05.ej3Mod6.model.persistence.mapper.ProfessionalMapper;
import cl.grupo05.ej3Mod6.model.persistence.repository.ProfessionalRepository;
import cl.grupo05.ej3Mod6.web.service.ProfessionalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalServiceImpl implements ProfessionalService {

    private final ProfessionalRepository repository;
    private final ProfessionalMapper mapper;

    public ProfessionalServiceImpl(ProfessionalRepository repository, ProfessionalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ProfessionalDTO> findAll(){
        return mapper.toProfessionalsDTO(repository.findAll());
    }

    @Override
    public ProfessionalDTO findById(int id) {
        return null;
    }

}
