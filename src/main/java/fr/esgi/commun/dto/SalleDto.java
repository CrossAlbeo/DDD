package fr.esgi.commun.dto;

import lombok.Getter;

import java.util.UUID;

@Getter
public class SalleDto {
    private UUID uuid;
    private String numero;
    private int capacite;
    private String batiment;
    private boolean disponible;
}
