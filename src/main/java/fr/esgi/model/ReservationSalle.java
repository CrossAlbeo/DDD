package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class ReservationSalle {
    private final UUID uuid;
    private final Salle salle;

    public ReservationSalle(Salle salle) {
        this.uuid = UUID.randomUUID();
        this.salle = salle;
    }
}
