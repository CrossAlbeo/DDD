package fr.esgi.model;

import fr.esgi.commun.dto.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Entretien {
    final UUID uid;
    final Candidat candidat;
    final Recruteur recruteur;
    final Salle salle;
    final Creneau creneau;
    Status status;

    public Entretien(CandidatDto candidatDto, RecruteurDto recruteurDto, SalleDto salleDto, CreneauDto creneauDto) {
        this.uid = UUID.randomUUID();

        List<Creneau> disponibilitesCandidat = new ArrayList<Creneau>();
        for (int i = 0; i < candidatDto.getDisponibilites().size(); i++) {
            disponibilitesCandidat.add(new Creneau(candidatDto.getDisponibilites().get(i)));
        }

        this.candidat = new Candidat(candidatDto.getName(), candidatDto.getCompetences(),
                candidatDto.getAnneesExperience(), disponibilitesCandidat);

        List<Creneau> disponibilitesRecruteur = new ArrayList<Creneau>();
        for(int i = 0; i < recruteurDto.getDisponibilites().size(); i++) {
            disponibilitesRecruteur.add(new Creneau(recruteurDto.getDisponibilites().get(i)));
        }

        this.recruteur = new Recruteur(recruteurDto.getName(), recruteurDto.getCompetences(),
                recruteurDto.getAnneesExperience(), disponibilitesRecruteur);
        this.salle = new Salle(salleDto.getNumero(), salleDto.getCapacite(), salleDto.getBatiment(), salleDto.isDisponible());
        this.creneau = new Creneau(creneauDto.getDate(), creneauDto.getHeureDebut(), creneauDto.getHeureFin());
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
