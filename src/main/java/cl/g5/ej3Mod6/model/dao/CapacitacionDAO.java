package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;

import java.util.List;

public interface CapacitacionDAO {
    public List<CapacitacionDTO> obtenerCapacitaciones();
    public void crearCap(CapacitacionDTO c);
}
