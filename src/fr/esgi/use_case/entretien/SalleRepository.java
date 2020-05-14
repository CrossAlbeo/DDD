package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.Salle;

public interface SalleRepository {
    Salle findAvailable();
}
