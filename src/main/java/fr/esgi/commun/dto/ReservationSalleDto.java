package fr.esgi.commun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class ReservationSalleDto {
    private final UUID uuid;
    private final UUID uuidSalle;
}
