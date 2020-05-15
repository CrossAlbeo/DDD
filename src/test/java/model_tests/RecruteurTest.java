package model_tests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;
import fr.esgi.commun.dto.SalleDto;
import fr.esgi.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RecruteurTest {

    private static Recruteur recruteur1;
    private static final UUID uuidRecruteur1 = UUID.randomUUID();
    private static Recruteur recruteur2;
    private static final UUID uuidRecruteur2 = UUID.randomUUID();
    private static Candidat candidat;
    private static final UUID uuidcandidat = UUID.randomUUID();

    @BeforeAll
    static void setup() {

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
    void should_be_created() {
        assertNotNull(entretien);
    }

    @Test
    void should_be_confirmed() {
        //entretien.confirmer();
        //assertEquals(Status.Confirme, entretien.getStatus());
    }
}
