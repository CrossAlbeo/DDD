package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.SalleDto;

import java.util.List;

public interface SalleRepository {
    List<SalleDto> find();
}
