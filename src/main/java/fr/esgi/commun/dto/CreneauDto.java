package fr.esgi.commun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class CreneauDto {
    UUID uuid;
    String date;
    String heureDebut;
    String heureFin;
}
