package fr.esgi.use_case.entretien;

import fr.esgi.model.Entretien;

import java.util.UUID;

public interface EntretienRepository {
    Entretien findById(UUID uuid);
    void sauvegarder(Entretien entretien);
}
