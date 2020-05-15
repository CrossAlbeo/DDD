package use_case_tests;

import fr.esgi.use_case.entretien.PlanifierEntretien;
import fr.esgi.use_case.entretien.repository.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanifierEntretienTests {

    static PlanifierEntretien planifierEntretien;

    @BeforeAll
    public static void setup() {
        planifierEntretien = new PlanifierEntretien(new Candidats(), new Entretiens(), new Recruteurs(),
                new Salles(), new ReservationsSalle());
    }

    @Test
    public void should_create_planifierEntretien() {
        assertEquals(1, planifierEntretien.getRecruteurs().findAll());
        assertEquals();
    }

    @Test
    public void should_planifier_entretien() {

    }
}
