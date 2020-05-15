package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Creneau {
    private UUID uuid;
    private String date;
    private String heureDebut;
    private String heureFin;

    public Creneau(String date, String heureDebut, String heureFin) {
        this.uuid = UUID.randomUUID();
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }
}
