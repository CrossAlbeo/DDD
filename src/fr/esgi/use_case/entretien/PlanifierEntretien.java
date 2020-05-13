package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.Candidat;
import fr.esgi.commun.dto.Entretien;
import fr.esgi.commun.dto.Recruteur;
import fr.esgi.commun.dto.Salle;

import java.util.Date;

public class PlanifierEntretien {

    public Entretien planifier(Candidat candidat, Date horaire, RecruteursRepository recruteurs, SallesRepository salles) {

        // Given
        Recruteur selectedRecruteur = recruteurs.findByExperience(candidat.anneesExperience);
        Salle  selectedSalle = salles.findAvailable();

        // WHEN
        Entretien entretien = new Entretien();

        // THEN
        entretien.ajoutCandidat(candidat);
        entretien.ajoutHoraire(horaire);
        entretien.ajoutRecruteur(selectedRecruteur);
        entretien.ajoutSalle(selectedSalle);

        return entretien;

//        /!\ LEGACY
//        // GIVEN
//        for (int i = 0; i < salles.size(); i++) {
//            if (salles.get(i).disponible) {
//                selectedSalle  = salles.get(i);
//            }
//        }
//
//        if (selectedSalle == null) {
//            System.out.println("Pas de salle disponible...");
//            return null;
//        }
//
//        // GIVEN
//        for (int i = 0; i < recruteurs.size(); i++) {
//            if (recruteurs.get(i).competences == candidat.competences) {
//                if (recruteurs.get(i).anneesExperience > candidat.anneesExperience)
//                    selectedRecruteur = recruteurs.get(i);
//            }
//        }
//
//        if(selectedRecruteur == null) {
//            System.out.println("Pas de recruteur disponible...");
//            return null;
//        }
//

    }
}
