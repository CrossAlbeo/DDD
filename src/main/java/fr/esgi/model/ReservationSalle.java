package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationSalle {
    private UUID uuid;
    private Salle salle;
    private Creneau creneau;

    ReservationSalle(Salle salle, Creneau creneau) {
        this.uuid = UUID.randomUUID();
        this.salle = salle;
        this.creneau = creneau;
    }
}
