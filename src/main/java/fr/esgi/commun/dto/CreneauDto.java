package fr.esgi.commun.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreneauDto {
    String date;
    int heureDebut;
    int heureFin;
}
