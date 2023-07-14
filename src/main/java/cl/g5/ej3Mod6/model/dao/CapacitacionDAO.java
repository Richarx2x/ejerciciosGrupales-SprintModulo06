package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CapacitacionDAO implements ICapacitacionDAO{

    @Override
    public List<CapacitacionDTO> obtenerCapacitaciones() {
        List<CapacitacionDTO>caps = new ArrayList<>();
        caps.add(new CapacitacionDTO("capacitacion1", "lista capacitacion uno"));
        caps.add(new CapacitacionDTO("capacitacion2", "lista capacitacion dos"));
        caps.add(new CapacitacionDTO("capacitacion3", "lista capacitacion tres"));
        caps.add(new CapacitacionDTO("capacitacion4", "lista capacitacion cuatro"));
        return caps;
    }

    @Override
    public boolean crearCap(CapacitacionDTO c) {

        return false;
    }
}
