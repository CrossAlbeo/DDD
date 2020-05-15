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

    public Salle(String numero, int capacite, String batiment) {
        this.uuid = UUID.randomUUID();
        this.numero = numero;
        this.capacite = capacite;
        this.batiment = batiment;
    }
}
