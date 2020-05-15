package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Recruteur {
    private UUID uuid;
    private String nom;
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

    public Recruteur(String nom, List<Competence> competences, int anneesExperience, List<Creneau> disponibilites) {
        this.uuid = UUID.randomUUID();
        this.nom = nom;
        this.competences = competences;
        this.anneesExperience = anneesExperience;
        this.disponibilites = disponibilites;
    }
}
