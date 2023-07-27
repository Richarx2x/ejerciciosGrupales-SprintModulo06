package cl.grupo05.ej3Mod6.web.service;

import cl.grupo05.ej3Mod6.model.domain.dto.CustomerDTO;

import java.util.List;
import java.util.Optional;
public interface CustomerService {

    List<CustomerDTO> findAll();
    public CustomerDTO findById(int id);
/*    boolean create(CustomerDTO customer);
    boolean update(CustomerDTO customer);
    boolean delete(int id);*/
}
