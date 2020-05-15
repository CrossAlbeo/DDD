package model_tests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CandidatTests {

    private static Candidat candidat;
    private static Entretien entretien;
    private static Recruteur recruteur;
    private static final UUID uuidEntretien = UUID.randomUUID();
    private static ReservationSalle reservationSalle;
    private static Creneau creneau;
    private static Status status;

    @BeforeAll
    static void setup() {

        candidat = new Candidat();
        recruteur = new Recruteur();
        reservationSalle = new ReservationSalle();
        creneau = new Creneau();
        status = Status.Confirme;

        entretien = new Entretien(uuidEntretien, candidat, recruteur, reservationSalle, creneau, status);

    }

    @Test
    void should_be_confirmed() {
        assertNotNull(entretien);
        assertEquals(Status.Confirme, entretien.getStatus());
    }
    @Test
    void should_be_annuled() {
        entretien.setStatus(Status.Annule);
        assertEquals(Status.Annule, entretien.getStatus());
    }


}