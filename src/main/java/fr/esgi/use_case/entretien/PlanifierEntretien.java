package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.*;
import fr.esgi.model.Entretien;

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

    // TODO id Candidat
    public void planifier(CandidatDto candidatDto, CreneauDto creneauDto) {

        // Given
        RecruteurDto selectedRecruteurDto = this.recruteurs.getAvailable(creneauDto);
        SalleDto selectedSalleDto = this.salles.findAvailable();

        UUID uid = UUID.randomUUID();

        // WHEN
        Entretien entretien = new Entretien(candidatDto, selectedRecruteurDto, selectedSalleDto, creneauDto);

        // THEN
        entretiens.sauvegarder(entretien);
    }
}
