package cl.grupo05.ej3Mod6.model.persistence.repository;

import cl.grupo05.ej3Mod6.model.persistence.entity.CapacitationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CapacitationRepository extends JpaRepository<CapacitationEntity, Integer> {
}
