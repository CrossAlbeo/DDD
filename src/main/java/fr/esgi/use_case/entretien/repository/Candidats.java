package fr.esgi.use_case.entretien.repository;


import fr.esgi.commun.dto.CandidatDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Candidats implements CandidatRepository {
    final private List<CandidatDto> candidats;

    public Candidats() {
        this.candidats = new ArrayList<>();
    }

    public List<CandidatDto> find() { return candidats; }

    public CandidatDto findById(UUID uuid) {
        for (CandidatDto candidat :
                candidats) {
            if (candidat.getUuid() == uuid) {
                return candidat;
            }
        }
        return null;
    }
}
