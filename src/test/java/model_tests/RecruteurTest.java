package model_tests;

import fr.esgi.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class RecruteurTest {

    private Recruteur recruteur1;
    private final UUID uuidRecruteur1 = UUID.randomUUID();
    private Recruteur recruteur2;
    private final UUID uuidRecruteur2 = UUID.randomUUID();
    private Candidat candidat;
    private final UUID uuidcandidat = UUID.randomUUID();

    @BeforeEach
    void setup() {
        List<Competence> competences1 = new ArrayList<>();
        competences1.add(Competence.Java);
        competences1.add(Competence.PHP);

        List<Competence> competences2 = new ArrayList<>();
        competences2.add(Competence.Java);
        competences2.add(Competence.DotNET);

        List<Creneau> creneaux = new ArrayList<>();
        creneaux.add(new Creneau("20/05/15", 10, 17));
        recruteur1 = new Recruteur(uuidRecruteur1, "Smith", competences1, 7, creneaux);
        recruteur2 = new Recruteur(uuidRecruteur2, "Doe", competences2, 7, creneaux);

        candidat = new Candidat(uuidcandidat, "John", competences2, 5);

    }

    @Test
    void should_be_qualified() {
        assertFalse(recruteur1.estQualifie(candidat));
        assertTrue(recruteur2.estQualifie(candidat));
    }

    @Test
    void should_get_creneau_disponible() {
        Creneau creneau = new Creneau("20/05/15", 14, 15);

        Creneau creneauDisponible = recruteur1.creneauDisponible(creneau);

        assertEquals("20/05/15",creneauDisponible.getDate());
        assertEquals(10, creneauDisponible.getHeureDebut());
        assertEquals(17, creneauDisponible.getHeureFin());
    }

    @Test
    void should_remove_creneau() {
        Creneau creneauARetirer = recruteur1.getDisponibilites().get(0);

        recruteur1.reserverCreneau(creneauARetirer);

        assertEquals(0, recruteur1.getDisponibilites().size());
    }
}
