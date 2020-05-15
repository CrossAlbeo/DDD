package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.CandidatDto;

import java.util.List;
import java.util.UUID;

public interface CandidatRepository {
    CandidatDto findById(UUID uuid);
    List<CandidatDto> find();
}
