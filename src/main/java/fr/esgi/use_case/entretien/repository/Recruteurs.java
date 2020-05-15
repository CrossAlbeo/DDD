package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;
import fr.esgi.model.Competence;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Recruteurs implements RecruteurRepository {
    private final List<RecruteurDto> recruteurs;

    public Recruteurs() {
        this.recruteurs = new ArrayList<>();

        List<Competence> competences = new ArrayList<>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);
        competences.add(Competence.PHP);

        List<CreneauDto> creneauxDto = new ArrayList<>();
        creneauxDto.add(new CreneauDto("20/05/16", 8, 19));
        creneauxDto.add(new CreneauDto("21/05/16", 9, 17));

        this.recruteurs.add(new RecruteurDto(UUID.randomUUID(), "Diego", competences, 10, creneauxDto));
    }

    public List<RecruteurDto> find() {
        return this.recruteurs;
    }

    public List<RecruteurDto> findAvailables(CreneauDto creneauDto) {
        List<RecruteurDto> recruteursAvailable = new ArrayList<>();

        for (RecruteurDto recruteurDto :
                recruteurs) {
            for (CreneauDto creneau :
                    recruteurDto.getDisponibilites()) {
                if (creneau.getDate().equals(creneauDto.getDate()) &&
                        creneau.getHeureDebut() <= creneauDto.getHeureDebut() &&
                        creneau.getHeureFin() >= creneauDto.getHeureFin()) {
                    recruteursAvailable.add(recruteurDto);
                    break;
                }
            }
        }
        return recruteursAvailable;
    }

    public void sauvegarder(RecruteurDto recruteurDto) {
        this.recruteurs.add(recruteurDto);
    }
}
