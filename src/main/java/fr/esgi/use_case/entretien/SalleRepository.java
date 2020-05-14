package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.SalleDto;

public interface SalleRepository {
    SalleDto findAvailable();
}
