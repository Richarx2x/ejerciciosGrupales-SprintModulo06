package cl.g5.ej3Mod6.model.dao;

import cl.g5.ej3Mod6.model.dto.UsuarioDTO;

import java.util.List;

public interface UsuarioDAO {
    UsuarioDTO findbyId(int id);
    List<UsuarioDTO> findAll();
    boolean create(UsuarioDTO u);
    boolean update(UsuarioDTO u);
    boolean delete(UsuarioDTO u);
}
