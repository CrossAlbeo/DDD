package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.SalleDto;
import fr.esgi.model.Creneau;

import java.util.List;

public interface SalleRepository {
    List<SalleDto> findAvailables(Creneau creneau);
}
