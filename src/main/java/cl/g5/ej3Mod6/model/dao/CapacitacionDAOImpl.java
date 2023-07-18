package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import cl.g5.ej3Mod6.model.mapper.CapacitacionMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
@Component
public class CapacitacionDAOImpl implements CapacitacionDAO{

    //clase con anotación @component e implementa la interfaz del crud

    JdbcTemplate jdbcTemplate;

    public CapacitacionDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public List<CapacitacionDTO> obtenerCapacitaciones() {

        return jdbcTemplate.query("select id, nombre, detalle from capacitacion",new CapacitacionMapper());
    }
    @Override
    public CapacitacionDTO findbyId(int id) {
        return null;
    }



    @Override
    public void crearCap(CapacitacionDTO c) {
        //CapacitacionDTO cap= c;
       // obtenerCapacitaciones().add(c);
        System.out.println("Capacitacion creada"+c.toString());

    }

    @Override
    public boolean update(CapacitacionDTO c) {
        return false;
    }

    @Override
    public boolean delete(CapacitacionDTO c) {
        return false;
    }
}
