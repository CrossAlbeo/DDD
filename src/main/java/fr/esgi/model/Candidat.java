package fr.esgi.model;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.dto.Competences;
import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.mappers.CandidatMapper;

import java.util.List;

public class Candidat {
    private String nom;
    private List<Competences> competences;
    private int anneesExperience;
    private List<Creneau> disponibilites;

    public void accepterRendezVous(Entretien entretien) {
        entretien.confirmer();
    }

    public Candidat(String nom, List<Competences> competences, int anneesExperience, List<Creneau> disponibilites) {
        this.nom = nom;
        this.competences = competences;
        this.anneesExperience = anneesExperience;
        this.disponibilites = disponibilites;
    }

    public static Candidat fromDto(CandidatDto candidatDto) {
        return CandidatMapper.instance.toModel(candidatDto);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
