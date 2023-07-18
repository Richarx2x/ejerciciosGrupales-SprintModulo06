package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.UsuarioDTO;
import cl.g5.ej3Mod6.model.mapper.UsuarioMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class UsuarioDAOImpl implements UsuarioDAO{
    JdbcTemplate jdbcTemplate;
    public UsuarioDAOImpl(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public UsuarioDTO findbyId(int id) {
        return null;
    }

    @Override
    public List<UsuarioDTO> findAll() {

        return jdbcTemplate.query("select id, nombre, username from usuario", new UsuarioMapper());
    }

    @Override
    public boolean create(UsuarioDTO u) {
        return false;
    }

    @Override
    public boolean update(UsuarioDTO u) {
        return false;
    }

    @Override
    public boolean delete(UsuarioDTO u) {
        return false;
    }
}
