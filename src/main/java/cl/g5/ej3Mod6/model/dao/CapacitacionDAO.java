package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;

import java.util.List;

public interface CapacitacionDAO {
    //crud en interface
    CapacitacionDTO findbyId(int id);
    public List<CapacitacionDTO> obtenerCapacitaciones();
    public void crearCap(CapacitacionDTO c);
    boolean update(CapacitacionDTO c);
    boolean delete(CapacitacionDTO c);
}
