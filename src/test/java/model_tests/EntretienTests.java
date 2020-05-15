package model_tests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.model.Competence;
import fr.esgi.commun.dto.CreneauDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class EntretienTests {

    private static List<Competence> competences;
    private static List<CreneauDto> creneauDtos;
    private static CandidatDto candidatDto;

    @BeforeAll
    static void setup() {
        competences = new ArrayList<>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        CreneauDto creneauDto1 = new CreneauDto();
        creneauDtos.add(new CreneauDto());
        creneauDtos.add(new CreneauDto());

        candidatDto = new CandidatDto();
    }

    @Test
    void should_create_entretien() {

    }

    @Test
    void should_set_entretien_at_planifier() {

    }


}
