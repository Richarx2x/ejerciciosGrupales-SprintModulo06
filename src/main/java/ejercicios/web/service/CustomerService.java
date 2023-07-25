package ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public Optional<Customer> findById(int id);
    public Optional<List<Customer>> findAll();
}
