package ModelTests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.model.Competence;
import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.model.Entretien;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class EntretienTests {

    List<Competence> competences;
    List<CreneauDto> creneauDtos;
    CandidatDto candidatDto;

    @BeforeAll
    public void setup() {
        competences = new ArrayList<Competence>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        creneauDtos.add(new CreneauDto());
    }

    @Test
    public void should_create_entretien() {
        Entretien entretien = new Entretien();
    }

    @Test
    public void test_planifier() {

    }
}
