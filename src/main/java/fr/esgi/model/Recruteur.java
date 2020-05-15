package fr.esgi.model;

import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
public class Recruteur {
    private final UUID uuid;
    private final String name;
    private List<Competence> competences;
    private int anneesExperience;
    private List<Creneau> disponibilites;

    public boolean estQualifie(Candidat candidat) {
        for (Competence competence:
             this.getCompetences()) {
            if (!candidat.getCompetences().contains(competence)) {
                return false;
            }
        }
        return true;
    }

    public boolean estDisponible(Creneau creneau) {
        return true;
    }

    public Recruteur(String name, List<Competence> competences, int anneesExperience, List<Creneau> disponibilites) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.competences = competences;
        this.anneesExperience = anneesExperience;
        this.disponibilites = disponibilites;
    }
}
