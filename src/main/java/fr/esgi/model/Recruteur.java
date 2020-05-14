package fr.esgi.model;

import fr.esgi.commun.dto.Competences;

import java.util.List;
import java.util.UUID;

public class Recruteur {
    private String name;
    private List<Competences> competences;
    private int anneesExperience;
    private List<Creneau> disponibilites;

    public boolean estCapableEvoluer(UUID uuid) {
        return true;
    }

    public Recruteur(String name, List<Competences> competences, int anneesExperience, List<Creneau> disponibilites) {
        this.name = name;
        this.competences = competences;
        this.anneesExperience = anneesExperience;
        this.disponibilites = disponibilites;
    }

    public boolean estDisponible(Creneau creneau) {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Competences> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competences> competences) {
        this.competences = competences;
    }

    public int getAnneesExperience() {
        return anneesExperience;
    }

    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    public List<Creneau> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<Creneau> disponibilites) {
        this.disponibilites = disponibilites;
    }
}
