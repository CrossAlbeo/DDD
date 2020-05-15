package fr.esgi.model;

import fr.esgi.commun.dto.*;
import fr.esgi.commun.mappers.CandidatMapper;
import fr.esgi.commun.mappers.CreneauMapper;
import fr.esgi.commun.mappers.RecruteurMapper;
import fr.esgi.commun.mappers.SalleMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entretien {
    UUID uuid;
    Candidat candidat;
    Recruteur recruteur;
    ReservationSalle reservationSalle;
    Creneau creneau;
    Status status;

    public Entretien(CandidatDto candidatDto, List<RecruteurDto> recruteursDto, CreneauDto creneauDto) {
        this.uuid = UUID.randomUUID();
        this.candidat = CandidatMapper.instance.toModel(candidatDto);
        this.creneau = CreneauMapper.instance.toModel(creneauDto);

        List<Recruteur> recruteurs = RecruteurMapper.instance.toModel(recruteursDto);
        for (Recruteur recruteur:
                recruteurs) {
            if (recruteur.estQualifie(this.candidat) &&
                    recruteur.getAnneesExperience() > this.candidat.getAnneesExperience()) {
                Creneau creneauDisponible = recruteur.creneauDisponible(creneau);
                if (creneauDisponible != null) {
                    recruteur.reserverCreneau(creneauDisponible);
                    this.recruteur = recruteur;
                    break;
                }
            }
        }
    }

    public void planifier(List<SalleDto> sallesDto) {
        if (sallesDto.size() > 0) {
             this.reservationSalle = new ReservationSalle(SalleMapper.instance.toModel(sallesDto.get(0)), creneau);
        }
        this.status = Status.Planifie;
    }

    public void annuler() {
        this.status = Status.Annule;
    }

    public void confirmer() {
        this.status = Status.Confirme;
    }

    public void reporter() {
        this.status = Status.Planifie;
    }
}
