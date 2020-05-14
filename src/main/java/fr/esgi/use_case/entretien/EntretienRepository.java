package fr.esgi.use_case.entretien;

import fr.esgi.model.Entretien;

public interface EntretienRepository {
    void sauvegarder(Entretien entretien);
}
