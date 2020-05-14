package fr.esgi.model;

import fr.esgi.commun.dto.CreneauDto;

public class Creneau {
    String date;
    String heureDebut;
    String heureFin;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }
}
