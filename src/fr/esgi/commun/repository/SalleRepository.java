package fr.esgi.commun.repository;

import fr.esgi.commun.dto.Salle;

public interface SalleRepository {
    Salle findAvailable();
}
