package fr.esgi.use_case.entretien.repository;


import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;

import java.util.List;

public interface RecruteurRepository {
    List<RecruteurDto> find();
    List<RecruteurDto> findAvailables(CreneauDto creneauDto);
    void sauvegarder(RecruteurDto recruteurDto);
}
