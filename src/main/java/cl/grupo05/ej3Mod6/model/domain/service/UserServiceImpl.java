package cl.grupo05.ej3Mod6.model.domain.service;


import cl.grupo05.ej3Mod6.web.service.UserService;
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
        return mapper.toUserDTO(repository.findAll());
    }


    @Override
    public UserDTO findById(int id) {
        return null;
    }


}