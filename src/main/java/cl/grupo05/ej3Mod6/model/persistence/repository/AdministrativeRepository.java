package cl.grupo05.ej3Mod6.model.persistence.repository;

import cl.grupo05.ej3Mod6.model.persistence.entity.AdministrativeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministrativeRepository extends JpaRepository<AdministrativeEntity, Integer> {
}
