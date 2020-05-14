package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.*;
import fr.esgi.model.Candidat;
import fr.esgi.model.Entretien;

import java.util.List;
import java.util.UUID;

public class PlanifierEntretien {

    final CandidatRepository candidats;
    final RecruteurRepository recruteurs;
    final SalleRepository salles;
    final EntretienRepository entretiens;

    public PlanifierEntretien(CandidatRepository candidats, EntretienRepository entretiens,
                              RecruteurRepository recruteurs, SalleRepository salles) {
        this.candidats = candidats;
        this.recruteurs = recruteurs;
        this.salles = salles;
        this.entretiens = entretiens;
    }

    public void planifier(UUID uuid, CreneauDto creneauDto) {

        // Given
        CandidatDto candidatDto = this.candidats.findById(uuid);
        List<RecruteurDto> selectedRecruteursDto = this.recruteurs.getAvailables(creneauDto);
        List<SalleDto> selectedSallesDto = this.salles.findAvailables();

        // WHEN
        Entretien entretien = new Entretien(candidatDto);
        entretien.planifier(selectedRecruteursDto, selectedSallesDto, creneauDto);

        // THEN
        entretiens.sauvegarder(entretien);
    }
}
