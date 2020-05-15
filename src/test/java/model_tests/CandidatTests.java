package model_tests;

import fr.esgi.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CandidatTests {

    private static Entretien entretien;
    private static final UUID uuidEntretien = UUID.randomUUID();

    @BeforeAll
    static void setup() {
        entretien = new Entretien(uuidEntretien, new Candidat(), new Recruteur(), new ReservationSalle(), new Creneau(), Status.Annule);
    }

    @Test
    void should_be_created() {
        assertNotNull(entretien);
    }

    @Test
    void should_be_confirmed() {
        entretien.confirmer();
        assertEquals(Status.Confirme, entretien.getStatus());
    }

    @Test
    void should_be_cancelled() {
        entretien.annuler();
        assertEquals(Status.Annule, entretien.getStatus());
    }

    @Test
    void should_be_reported() {
        entretien.reporter();
        assertEquals(Status.Planifie, entretien.getStatus());
    }
}
