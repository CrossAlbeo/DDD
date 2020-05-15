package mapper_tests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.mappers.CandidatMapper;
import fr.esgi.model.Candidat;
import fr.esgi.model.Competence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CandidatMapperTests {

    private static Candidat candidat;
    private static CandidatDto candidatDto;
    private static final UUID uuidCandidat = UUID.randomUUID();
    private static final UUID uuidcandidatDto = UUID.randomUUID();

    @BeforeAll
    static void  setup() {
        List<Competence> competences = new ArrayList<>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        candidat = new Candidat(uuidCandidat, "Will", competences, 10);
        candidatDto = new CandidatDto(uuidcandidatDto, "Smith", competences, 5);
    }

    @Test
    void should_map_candidatModel_to_candidatDto() {
        CandidatDto candidatDto = CandidatMapper.instance.toDto(candidat);

        assertNotNull(candidatDto);
        assertEquals(uuidCandidat, candidatDto.getUuid());
        assertEquals("Will", candidatDto.getNom());
        assertEquals(candidat.getCompetences(), candidatDto.getCompetences());
        assertEquals(10, candidatDto.getAnneesExperience());
    }

    @Test
    void should_map_candidatDto_to_candidatModel() {
        Candidat candidatModel = CandidatMapper.instance.toModel(candidatDto);

        assertNotNull(candidatModel);
        assertEquals(uuidcandidatDto, candidatModel.getUuid());
        assertEquals("Smith", candidatModel.getNom());
        assertEquals(candidat.getCompetences(), candidatModel.getCompetences());
        assertEquals(5, candidatModel.getAnneesExperience());
    }
}
