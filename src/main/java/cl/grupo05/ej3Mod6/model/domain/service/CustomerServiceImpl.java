package cl.grupo05.ej3Mod6.model.domain.service;

import cl.grupo05.ej3Mod6.model.domain.dto.CustomerDTO;
import cl.grupo05.ej3Mod6.model.persistence.mapper.CustomerrMapper;
import cl.grupo05.ej3Mod6.model.persistence.repository.CustomerRepository;
import cl.grupo05.ej3Mod6.web.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final CustomerrMapper mapper;

    public CustomerServiceImpl(CustomerRepository repository, CustomerrMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<CustomerDTO> findAll() {
        return mapper.toCustomersDTO(repository.findAll());
    }

    @Override
    public CustomerDTO findById(int id) {
        return null;
    }
}
