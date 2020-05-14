package fr.esgi.commun.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class RecruteurDto {
    private String name;
    private List<Competence> competences;
    private int anneesExperience;
    private List<CreneauDto> disponibilites;
}
