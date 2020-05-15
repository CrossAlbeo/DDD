package fr.esgi.commun.dto;

import fr.esgi.model.Competence;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CandidatDto {
    private UUID uuid;
    private String nom;
    private List<Competence> competences;
    private int anneesExperience;
    private List<CreneauDto> disponibilites;
}
