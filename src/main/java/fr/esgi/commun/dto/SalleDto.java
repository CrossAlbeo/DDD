package fr.esgi.commun.dto;

import lombok.Getter;

@Getter
public class SalleDto {
    private String numero;
    private int capacite;
    private String batiment;
    private boolean disponible;
}
