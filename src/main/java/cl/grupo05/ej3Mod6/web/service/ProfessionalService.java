package cl.grupo05.ej3Mod6.web.service;

import cl.grupo05.ej3Mod6.model.domain.dto.ProfessionalDTO;

import java.util.List;
import java.util.Optional;

public interface ProfessionalService {
    public List<ProfessionalDTO> findAll();
    public ProfessionalDTO findById(int id);
/*    boolean create(CapacitationDTO capacitation);
    boolean update(CapacitationDTO capacitation);
    boolean delete(int id);*/
}
