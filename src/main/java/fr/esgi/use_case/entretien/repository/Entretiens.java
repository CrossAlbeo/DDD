package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.EntretienDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Entretiens implements EntretienRepository {
    final List<EntretienDto> entretienDtos;

    public Entretiens() {
        this.entretienDtos = new ArrayList<>();
    }

    public EntretienDto findById(UUID uuid) {
        for (EntretienDto entretien :
                entretienDtos) {
            if (entretien.getUuid() == uuid) {
                return entretien;
            }
        }
        return null;
    }

    public void sauvegarder(EntretienDto entretienDto) {
        this.entretienDtos.add(entretienDto);
    }
}
