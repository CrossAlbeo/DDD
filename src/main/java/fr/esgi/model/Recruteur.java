package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recruteur {
    private UUID uuid;
    private String nom;
    private List<Competence> competences;
    private int anneesExperience;
    private List<Creneau> disponibilites;

    boolean estQualifie(Candidat candidat) {
        for (Competence competence :
                this.getCompetences()) {
            if (!candidat.getCompetences().contains(competence)) {
                return false;
            }
        }
        return true;
    }

    Creneau creneauDisponible(Creneau creneau) {
        List<Creneau> creneaux = this.disponibilites
                .stream()
                .filter(creneauRecruteur -> creneauRecruteur.contient(creneau))
                .collect(Collectors.toList());

        return creneaux.size() > 0 ? creneaux.get(0) : null;
    }

    void reserverCreneau(Creneau creneauDisponible) {
        this.disponibilites.remove(creneauDisponible);
    }
}
