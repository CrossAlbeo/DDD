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

    static List<Competence> competences;
    static List<CreneauDto> creneauDtos;
    static CandidatDto candidatDto;

    @BeforeAll
    public static void setup() {
        competences = new ArrayList<Competence>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        CreneauDto creneauDto1 = new CreneauDto();
        creneauDtos.add(new CreneauDto());
        creneauDtos.add(new CreneauDto());

        candidatDto = new CandidatDto();
    }

    @Test
    public void should_create_entretien() {
        //Entretien entretien = new Entretien();
    }

    @Test
    public void test_planifier() {

    }
}
