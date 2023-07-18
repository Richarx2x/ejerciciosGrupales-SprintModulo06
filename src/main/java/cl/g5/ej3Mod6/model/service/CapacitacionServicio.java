package cl.g5.ej3Mod6.model.service;

import cl.g5.ej3Mod6.model.dao.CapacitacionDAO;
import cl.g5.ej3Mod6.model.dao.CapacitacionDAOImpl;
import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CapacitacionServicio {
//inyección de dependencia, para ello utiliza la interfaz
  private final CapacitacionDAO capDAO;

    public CapacitacionServicio(CapacitacionDAO capDAO) {
        this.capDAO = capDAO;
    }

    public List<CapacitacionDTO> listaCapacitaciones (){

    return capDAO.obtenerCapacitaciones();
}
    public boolean create(CapacitacionDTO c) {
     return capDAO.crearCapacitacion(c);
    }
}
