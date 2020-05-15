package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.*;
import fr.esgi.commun.mappers.EntretienMapper;
import fr.esgi.commun.mappers.RecruteurMapper;
import fr.esgi.commun.mappers.ReservationSalleMapper;
import fr.esgi.model.Entretien;
import fr.esgi.use_case.entretien.repository.*;

import java.util.List;
import java.util.UUID;

public class PlanifierEntretien {
     private final CandidatRepository candidats;
     private final RecruteurRepository recruteurs;
     private final SalleRepository salles;
     private final EntretienRepository entretiens;
     private final ReservationSalleRepository reservationsSalle;

    public PlanifierEntretien(CandidatRepository candidats, EntretienRepository entretiens, RecruteurRepository recruteurs,
                              SalleRepository salles, ReservationSalleRepository reservationSalleRepository) {
        this.candidats = candidats;
        this.recruteurs = recruteurs;
        this.salles = salles;
        this.entretiens = entretiens;
        this.reservationsSalle = reservationSalleRepository;
    }

    public void planifier(UUID uuid, CreneauDto creneauDto) {
        // Given
        CandidatDto candidatDto = this.candidats.findById(uuid);
        List<RecruteurDto> selectedRecruteursDto = this.recruteurs.findAvailables(creneauDto);
        List<SalleDto> selectedSallesDto = this.salles.find();

        // WHEN
        Entretien entretien = new Entretien(candidatDto);
        entretien.planifier(selectedRecruteursDto, selectedSallesDto, creneauDto);

        // THEN
        entretiens.sauvegarder(EntretienMapper.instance.toDto(entretien));
        recruteurs.sauvegarder(RecruteurMapper.instance.toDto(entretien.getRecruteur()));
        reservationsSalle.sauvegarder(ReservationSalleMapper.instance.toDto(entretien.getReservationSalle()));

    }
}
