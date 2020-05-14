package fr.esgi.model;

import lombok.Getter;

@Getter
public class Salle {
    private final String numero;
    private final int capacite;
    private final String batiment;
    private boolean disponible;

    public Salle(String numero, int capacite, String batiment, boolean disponible) {
        this.numero = numero;
        this.capacite = capacite;
        this.batiment = batiment;
        this.disponible = disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
