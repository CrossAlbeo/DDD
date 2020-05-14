package fr.esgi.commun.dto;

import java.util.Date;
import java.util.UUID;

enum Status {Confirme, Annule, Planifie}

public abstract class Entretien {
    final UUID uid;
    final Candidat candidat;
    final Recruteur recruteur;
    final Salle salle;
    final Date horaire;
    final Status status;

    public Entretien(UUID uid, Candidat candidat, Recruteur recruteur, Salle salle, Date horaire, Status status) {
        this.uid = uid;
        this.candidat = candidat;
        this.recruteur = recruteur;
        this.salle = salle;
        this.horaire = horaire;
        this.status = status;
    }
}
