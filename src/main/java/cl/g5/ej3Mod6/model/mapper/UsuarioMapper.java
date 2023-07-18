package cl.g5.ej3Mod6.model.mapper;

import cl.g5.ej3Mod6.model.dto.UsuarioDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioMapper implements RowMapper<UsuarioDTO> {

    @Override
    public UsuarioDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new UsuarioDTO(rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("username"));
    }
}
