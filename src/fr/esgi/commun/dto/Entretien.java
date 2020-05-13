package fr.esgi.commun.dto;

import java.util.Date;

public class Entretien {
    Candidat candidat;
    Recruteur recruteur;
    Salle salle;
    Date horaire;

    public void ajoutCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public void ajoutRecruteur(Recruteur recruteur) {
        this.recruteur = recruteur;
    }

    public void ajoutSalle(Salle salle){
        this.salle = salle;
    }

    public void ajoutHoraire(Date horaire){
        this.horaire = horaire;
    }
}
