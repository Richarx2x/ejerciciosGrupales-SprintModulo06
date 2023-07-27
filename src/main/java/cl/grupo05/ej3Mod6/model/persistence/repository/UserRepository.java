package cl.grupo05.ej3Mod6.model.persistence.repository;

import cl.grupo05.ej3Mod6.model.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
