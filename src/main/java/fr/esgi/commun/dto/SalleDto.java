package fr.esgi.commun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SalleDto {
    private UUID uuid;
    private String numero;
    private int capacite;
    private String batiment;
}
