package fr.esgi.commun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalleDto {
    private UUID uuid;
    private String numero;
    private int capacite;
    private String batiment;
}
