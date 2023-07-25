package ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public Optional<List<User>> findAll();
    public Optional<User> findById(int id);
}
