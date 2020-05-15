package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Candidat {
    private UUID uuid;
    private String nom;
    private List<Competence> competences;
    private int anneesExperience;

    public void accepterRendezVous(Entretien entretien) {
        entretien.confirmer();
    }
}
