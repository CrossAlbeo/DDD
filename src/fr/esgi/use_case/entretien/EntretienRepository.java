package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.Entretien;

public interface EntretienRepository {
    void sauvegarder(Entretien entretien);
}
