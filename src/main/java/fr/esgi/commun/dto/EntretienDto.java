package fr.esgi.commun.dto;

import fr.esgi.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntretienDto {
    private UUID uuid;
    private UUID uuidCandidat;
    private UUID uuidRecruteur;
    private UUID uuidReservationSalle;
    private CreneauDto creneauDto;
    private Status status;
}
