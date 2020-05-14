package fr.esgi.use_case.entretien;


import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;

public interface RecruteurRepository {
    RecruteurDto findByExperience(int experience);
    RecruteurDto getAvailable(CreneauDto creneauDto);
}
