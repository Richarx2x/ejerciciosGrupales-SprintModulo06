package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICapacitacionDAO {
 List<CapacitacionDTO> obtenerCapacitaciones();
 public boolean crearCap(CapacitacionDTO c);
}
