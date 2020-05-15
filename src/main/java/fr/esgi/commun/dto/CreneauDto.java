package fr.esgi.commun.dto;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public class CreneauDto {
    UUID uuid;
    String date;
    String heureDebut;
    String heureFin;
}
