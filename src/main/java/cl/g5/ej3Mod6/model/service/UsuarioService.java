package cl.g5.ej3Mod6.model.service;

import cl.g5.ej3Mod6.model.dao.UsuarioDAO;
import cl.g5.ej3Mod6.model.dto.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
    public List<UsuarioDTO>findAll(){
        return usuarioDAO.findAll();
    }
}
