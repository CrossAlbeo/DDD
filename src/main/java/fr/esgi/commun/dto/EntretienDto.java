package fr.esgi.commun.dto;

import fr.esgi.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class EntretienDto {
    private final UUID uuid;
    private final UUID uuidCreneau;
    private final UUID uuidCandidat;
    private final UUID uuidReservationSalle;
    private final Status status;
}
