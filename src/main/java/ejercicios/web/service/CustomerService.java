package ejercicios.web.service;

//import cl.modulo6.ejercicios.model.domain.dto.Customer;

import ejercicios.model.domain.dto.Customer;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CustomerService {
    public Optional<Customer> findById(int id);
    public Optional<List<Customer>> findAll();
}
