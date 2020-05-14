package fr.esgi.use_case.entretien;


import fr.esgi.commun.dto.Recruteur;

public interface RecruteurRepository {
    Recruteur findByExperience(int experience);
}
