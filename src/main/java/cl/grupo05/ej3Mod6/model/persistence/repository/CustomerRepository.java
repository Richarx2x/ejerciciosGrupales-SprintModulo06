package cl.grupo05.ej3Mod6.model.persistence.repository;

import cl.grupo05.ej3Mod6.model.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
