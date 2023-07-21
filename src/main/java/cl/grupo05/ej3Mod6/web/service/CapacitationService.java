package cl.grupo05.ej3Mod6.web.service;

import cl.grupo05.ej3Mod6.model.domain.dto.CapacitationDTO;

import java.util.List;

public interface CapacitationService {
    public List<CapacitationDTO> findAll();
    public CapacitationDTO findById(int id);

}
