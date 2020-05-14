package fr.esgi.use_case.entretien;

import fr.esgi.commun.dto.CandidatDto;

import java.util.UUID;

public interface CandidatRepository {
    CandidatDto findById(UUID uuid);
}
