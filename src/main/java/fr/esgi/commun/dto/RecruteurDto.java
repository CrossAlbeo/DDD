package fr.esgi.commun.dto;

import fr.esgi.model.Competence;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class RecruteurDto {
    private UUID uuid;
    private String name;
    private List<Competence> competences;
    private int anneesExperience;
    private List<CreneauDto> disponibilites;
}
