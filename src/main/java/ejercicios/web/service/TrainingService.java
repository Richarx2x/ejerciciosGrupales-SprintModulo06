package ejercicios.web.service;

import cl.modulo6.ejercicios.model.domain.dto.Training;

import java.util.List;
import java.util.Optional;

public interface TrainingService {
    public Optional<List<Training>> findAll();
    public Optional<Training> findById(int id);
    public Optional<Training> create(Training training);
    public Optional<Training> update(Training training);
    public boolean delete(int id);
}
