package fr.esgi.model;

import fr.esgi.commun.dto.CreneauDto;
import lombok.Getter;

@Getter
public class Creneau {
    private final String date;
    private final String heureDebut;
    private final String heureFin;

    public Creneau(String date, String heureDebut, String heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public Creneau(CreneauDto creneauDto) {
        this.date = creneauDto.getDate();
        this.heureDebut = creneauDto.getHeureDebut();
        this.heureFin = creneauDto.getHeureFin();
    }
}
