package fr.esgi.commun.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class SalleDto {
    private UUID uuid;
    private String numero;
    private int capacite;
    private String batiment;
}
