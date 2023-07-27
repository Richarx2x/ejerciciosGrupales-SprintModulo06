package cl.grupo05.ej3Mod6.model.domain.service;


import cl.grupo05.ej3Mod6.model.domain.dto.UserDTO;
import cl.grupo05.ej3Mod6.model.persistence.mapper.UserMapper;
import cl.grupo05.ej3Mod6.model.persistence.repository.UserRepository;
import cl.grupo05.ej3Mod6.web.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserMapper mapper;

    public UserServiceImpl (UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<UserDTO> findAll(){
        return mapper.toUsersDTO(repository.findAll());
    }


    @Override
    public User findById(int id) {
        return null;
    }


}