package fr.esgi.use_case.entretien;


import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;

import java.util.List;

public interface RecruteurRepository {
    List<RecruteurDto> findAll();
    List<RecruteurDto> getAvailables(CreneauDto creneauDto);
}
