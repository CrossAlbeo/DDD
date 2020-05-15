package fr.esgi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class Salle {
    private UUID uuid;
    private String numero;
    private int capacite;
    private String batiment;
    private boolean disponible;

    public Salle(String numero, int capacite, String batiment, boolean disponible) {
        this.uuid = UUID.randomUUID();
        this.numero = numero;
        this.capacite = capacite;
        this.batiment = batiment;
        this.disponible = disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
