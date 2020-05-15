package fr.esgi.model;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.mappers.CandidatMapper;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
public class Candidat {
    private final UUID uuid;
    private String nom;
    private List<Competence> competences;
    private int anneesExperience;
    private List<Creneau> disponibilites;

    public void accepterRendezVous(Entretien entretien) {
        entretien.confirmer();
    }

    public Candidat(String nom, List<Competence> competences, int anneesExperience, List<Creneau> disponibilites) {
        this.uuid = UUID.randomUUID();
        this.nom = nom;
        this.competences = competences;
        this.anneesExperience = anneesExperience;
        this.disponibilites = disponibilites;
    }

    public static Candidat fromDto(CandidatDto candidatDto) {
        return CandidatMapper.instance.toModel(candidatDto);
    }
}
