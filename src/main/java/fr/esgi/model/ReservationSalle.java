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

    public ReservationSalle(Salle salle) {
        this.uuid = UUID.randomUUID();
        this.salle = salle;
    }
}
