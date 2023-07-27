package cl.grupo05.ej3Mod6.model.domain.service;

import cl.grupo05.ej3Mod6.model.domain.dto.AdministrativeDTO;
import cl.grupo05.ej3Mod6.model.persistence.mapper.AdministrativeMapper;
import cl.grupo05.ej3Mod6.model.persistence.repository.AdministrativeRepository;
import cl.grupo05.ej3Mod6.web.service.AdministrativeService;
import org.springframework.stereotype.Service;

import java.util.List;
public class AdministrativeServiceImpl implements AdministrativeService {

    private final AdministrativeRepository repository;
    private final AdministrativeMapper mapper;

    public AdministrativeServiceImpl(AdministrativeRepository repository, AdministrativeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<AdministrativeDTO> findAll() {
        return mapper.toAdministrativesDTO(repository.findAll());
    }

    @Override
    public AdministrativeDTO findById(int id) {
        return null;
    }
}
