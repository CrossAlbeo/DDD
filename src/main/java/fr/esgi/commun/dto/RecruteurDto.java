package fr.esgi.commun.dto;

import java.util.List;

public class RecruteurDto {
    private String name;
    private List<Competences> competences;
    private int anneesExperience;
    private List<CreneauDto> disponibilites;

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

    public List<CreneauDto> getDisponibilites() {
        return disponibilites;
    }

    public void setDisponibilites(List<CreneauDto> disponibilites) {
        this.disponibilites = disponibilites;
    }
}
