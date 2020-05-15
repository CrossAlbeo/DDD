package use_case_tests;

import fr.esgi.use_case.entretien.PlanifierEntretien;
import fr.esgi.use_case.entretien.repository.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlanifierEntretienTests {

    private static PlanifierEntretien planifierEntretien;
    private static final Candidats candidats = new Candidats();
    private static final Recruteurs recruteurs = new Recruteurs();
    private static final Entretiens entretiens = new Entretiens();
    private static final Salles salles = new Salles();
    private static final ReservationsSalle reservationsSalle = new ReservationsSalle();

    @BeforeAll
    static void setup() {
        planifierEntretien = new PlanifierEntretien(candidats, entretiens, recruteurs, salles, reservationsSalle);
    }

    @Test
    void should_create_planifierEntretien() {
        assertEquals(0, candidats.find().size());
        assertEquals(0, entretiens.find().size());
        assertEquals(1, recruteurs.find().size());
        assertEquals(3, salles.find().size());
        assertEquals(0, reservationsSalle.find().size());
    }

    @Test
    void should_planifier_entretien() {

    }
}
