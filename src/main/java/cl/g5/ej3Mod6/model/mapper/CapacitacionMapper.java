package cl.g5.ej3Mod6.model.mapper;

import cl.g5.ej3Mod6.model.dto.CapacitacionDTO;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CapacitacionMapper implements RowMapper<CapacitacionDTO> {


    public CapacitacionDTO mapRow(ResultSet rs,int rowNum) throws SQLException {
        return new CapacitacionDTO(rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("detalle"));
    }


}
