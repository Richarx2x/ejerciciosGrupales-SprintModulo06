package cl.grupo05.ej3Mod6.model.persistence.repository;

import cl.grupo05.ej3Mod6.model.persistence.entity.ProfessionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionalRepository extends JpaRepository<ProfessionalEntity, Integer> {
}
