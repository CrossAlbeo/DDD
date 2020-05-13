package fr.esgi.use_case.entretien;

import fr.esgi.use_case.entretien.dto.Candidat;
import fr.esgi.use_case.entretien.dto.Entretien;
import fr.esgi.use_case.entretien.dto.Recruteur;
import fr.esgi.use_case.entretien.dto.Salle;

import java.util.Date;
import java.util.List;

public class PlanifierEntretien {
    public Entretien planifier(Candidat candidat, Date horaire, List<Recruteur> recruteurs, List<Salle> salles) {

        Recruteur selectedRecruteur = null;
        Salle  selectedSalle = null;

        for (int i = 0; i < salles.size(); i++) {
            if (salles.get(i).disponible) {
                selectedSalle  = salles.get(i);
            }
        }

        if (selectedSalle == null) {
            System.out.println("Pas de salle disponible...");
            return null;
        }

        for (int i = 0; i < recruteurs.size(); i++) {
            if (recruteurs.get(i).competences == candidat.competences) {
                if (recruteurs.get(i).anneesExperience > candidat.anneesExperience)
                    selectedRecruteur = recruteurs.get(i);
            }
        }

        if(selectedRecruteur == null) {
            System.out.println("Pas de recruteur disponible...");
            return null;
        }

        return new Entretien(candidat, horaire, selectedSalle, selectedRecruteur);
    }
}
