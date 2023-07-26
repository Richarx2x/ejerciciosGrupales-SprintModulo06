package cl.grupo05.ej3Mod6.web.service;

import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User findById(int id);
}
