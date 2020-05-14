package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.*;

import java.util.Date;
import java.util.UUID;

public class PlanifierEntretien {

    final RecruteurRepository recruteurs;
    final SalleRepository salles;
    final EntretienRepository entretiens;

    public PlanifierEntretien(EntretienRepository entretiens, RecruteurRepository recruteurs, SalleRepository salles) {
        this.recruteurs = recruteurs;
        this.salles = salles;
        this.entretiens = entretiens;
    }

    public void planifier(Candidat candidat, Date horaire) {

        // Given
        Recruteur selectedRecruteur = this.recruteurs.findByExperience(candidat.anneesExperience);
        Salle  selectedSalle = this.salles.findAvailable();

        UUID uid = UUID.randomUUID();

        // WHEN
        Entretien entretien = new EntretienPlanifie(uid, candidat, selectedRecruteur, selectedSalle, horaire);

        // THEN
        entretiens.sauvegarder(entretien);

    }
}
