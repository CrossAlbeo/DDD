package fr.esgi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public
class Creneau {
    private String date;
    private int heureDebut;
    private int heureFin;

    public boolean contient(Creneau creneau) {
        if (!this.date.equals(creneau.date)) {
            return false;
        }
        return heureDebut <= creneau.heureDebut && heureFin >= creneau.heureFin;
    }
}
