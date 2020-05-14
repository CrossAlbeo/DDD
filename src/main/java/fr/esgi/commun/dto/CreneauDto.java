package fr.esgi.commun.dto;

import java.util.Date;

public class CreneauDto {
    String date;
    String heureDebut;
    String heureFin;

    public CreneauDto(Date date, int dureeMinutes) {

    }

    public void equals(){}

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
