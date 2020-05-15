package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Creneau {
    private final UUID uuid;
    private final String date;
    private final String heureDebut;
    private final String heureFin;

    public Creneau(String date, String heureDebut, String heureFin) {
        this.uuid = UUID.randomUUID();
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }
}
