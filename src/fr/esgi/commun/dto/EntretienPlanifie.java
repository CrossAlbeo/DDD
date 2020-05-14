package fr.esgi.commun.dto;

import java.util.Date;
import java.util.UUID;

public class EntretienPlanifie extends Entretien {
    public EntretienPlanifie(UUID uid, Candidat candidat, Recruteur recruteur, Salle salle, Date horaire) {
        super(uid, candidat, recruteur, salle, horaire, Status.Planifie);
    }
}
