package use_case_tests;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.EntretienDto;
import fr.esgi.commun.mappers.CandidatMapper;
import fr.esgi.model.Candidat;
import fr.esgi.model.Competence;
import fr.esgi.use_case.entretien.PlanifierEntretien;
import fr.esgi.use_case.entretien.repository.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlanifierEntretienTests {

    private static PlanifierEntretien planifierEntretien;
    private static final Candidats candidats = new Candidats();
    private static final Recruteurs recruteurs = new Recruteurs();
    private static final Entretiens entretiens = new Entretiens();
    private static final Salles salles = new Salles();
    private static final ReservationsSalle reservationsSalle = new ReservationsSalle();

    private static final UUID uuidCandidat = UUID.randomUUID();

    @BeforeAll
    static void setup() {
        planifierEntretien = new PlanifierEntretien(candidats, entretiens, recruteurs, salles, reservationsSalle);

        List<Competence> competences = new ArrayList<>();
        competences.add(Competence.PHP);

        Candidat candidat = new Candidat(uuidCandidat, "Nicolas", competences, 5);
        candidats.sauvegarder(CandidatMapper.instance.toDto(candidat));
    }

    @Test
    void should_create_planifierEntretien() {
        assertEquals(1, candidats.find().size());
        assertEquals(0, entretiens.find().size());
        assertEquals(1, recruteurs.find().size());
        assertEquals(3, salles.find().size());
        assertEquals(0, reservationsSalle.find().size());
    }

    @Test
    void should_planifier_entretien() {
        CreneauDto creneauDto = new CreneauDto("20/05/16", 10, 11);
        planifierEntretien.planifier(uuidCandidat, creneauDto);

        assertEquals(1, entretiens.find().size());
        EntretienDto entretienDto = entretiens.find().get(0);

        assertEquals(recruteurs.find().get(0).getUuid(), entretienDto.getUuidRecruteur());
    }
}
