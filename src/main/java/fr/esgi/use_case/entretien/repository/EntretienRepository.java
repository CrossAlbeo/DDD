package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.EntretienDto;

import java.util.UUID;

public interface EntretienRepository {
    EntretienDto findById(UUID uuid);
    void sauvegarder(EntretienDto entretienDto);
}
