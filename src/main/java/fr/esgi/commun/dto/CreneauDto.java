package fr.esgi.commun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class CreneauDto {
    UUID uuid;
    String date;
    String heureDebut;
    String heureFin;
}
