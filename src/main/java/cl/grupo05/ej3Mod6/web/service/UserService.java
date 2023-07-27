package cl.grupo05.ej3Mod6.web.service;

import cl.grupo05.ej3Mod6.model.domain.dto.UserDTO;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<UserDTO> findAll();
    public User findById(int id);
}
