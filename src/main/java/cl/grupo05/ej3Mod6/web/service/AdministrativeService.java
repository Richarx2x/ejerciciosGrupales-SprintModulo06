package cl.grupo05.ej3Mod6.web.service;

import cl.grupo05.ej3Mod6.model.domain.dto.AdministrativeDTO;

import java.util.List;
import java.util.Optional;

public interface AdministrativeService {
    public List<AdministrativeDTO> findAll();
    public AdministrativeDTO findById(int id);
}
