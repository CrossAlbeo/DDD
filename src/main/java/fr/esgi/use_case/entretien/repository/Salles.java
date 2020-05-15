package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.SalleDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Salles implements SalleRepository {
    private final List<SalleDto> sallesDto;

    public Salles() {
        this.sallesDto = new ArrayList<>();
        this.sallesDto.add(new SalleDto(UUID.randomUUID(), "101", 4, "Batiment A"));
        this.sallesDto.add(new SalleDto(UUID.randomUUID(), "102", 2, "Batiment A"));
        this.sallesDto.add(new SalleDto(UUID.randomUUID(), "202", 10, "Batiment B"));
    }

    public List<SalleDto> find() {
        return this.sallesDto;
    }
}
