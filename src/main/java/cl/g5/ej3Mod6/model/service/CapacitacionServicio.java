package cl.g5.ej3Mod6.model.service;

import cl.g5.ej3Mod6.model.dao.CapacitacionDAO;
import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CapacitacionServicio {

   CapacitacionDAO capDAO;

    public CapacitacionServicio(CapacitacionDAO capDAO) {
        this.capDAO = capDAO;
    }

    public List<CapacitacionDTO> listaCapacitaciones (){
   List<CapacitacionDTO> lista = capDAO.obtenerCapacitaciones();
    return lista;
}
}
