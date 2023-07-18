package cl.g5.ej3Mod6.model.service;

import cl.g5.ej3Mod6.model.dao.CapacitacionDAOImpl;
import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CapacitacionServicio {

   CapacitacionDAOImpl capDAO;

    public CapacitacionServicio(CapacitacionDAOImpl capDAO) {
        this.capDAO = capDAO;
    }

    public List<CapacitacionDTO> listaCapacitaciones (){
   List<CapacitacionDTO> lista = capDAO.obtenerCapacitaciones();
    return lista;
}
    public void create(CapacitacionDTO c) {
     capDAO.crearCap(c);
    }
}
