package fr.esgi.commun.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CreneauDto {
    UUID uuid;
    String date;
    String heureDebut;
    String heureFin;
}
