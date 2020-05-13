package fr.esgi.use_case.entretien.dto;

import java.util.Date;

public class Entretien {
    Candidat candidat;
    Recruteur recruteur;
    Salle salle;
    Date horaire;

    public Entretien(Candidat candidat, Date horaire, Salle salle, Recruteur recruteur) {
        this.candidat = candidat;
        this.horaire = horaire;
        this.salle = salle;
        this.recruteur = recruteur;
    }
}
