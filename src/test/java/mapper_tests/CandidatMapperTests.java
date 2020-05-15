package mapper_tests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.mappers.CandidatMapper;;
import fr.esgi.model.Candidat;
import fr.esgi.model.Competence;
import fr.esgi.model.Creneau;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CandidatMapperTests {

    private static Candidat candidat;
    private static CandidatDto candidatDto;
    private static final UUID uuidCandidat = UUID.randomUUID();
    private static final UUID uuidcandidatDto = UUID.randomUUID();

    @BeforeAll
    public static void  setup() {
        List<Competence> competences = new ArrayList<>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        List<Creneau> creneaux = new ArrayList<>();
        creneaux.add(new Creneau("date", 14, 15));
        candidat = new Candidat(uuidCandidat, "Will", competences, 10, creneaux);

        List<CreneauDto> creneauxDto = new ArrayList<>();
        creneauxDto.add(new CreneauDto("date", 10, 11));
        candidatDto = new CandidatDto(uuidcandidatDto, "Smith", competences, 5, creneauxDto);
    }

    @Test
    public void should_map_candidatModel_to_candidatDto() {
        CandidatDto candidatDto = CandidatMapper.instance.toDto(candidat);

        assertNotNull(candidatDto);
        assertEquals(uuidCandidat, candidatDto.getUuid());
        assertEquals("Will", candidatDto.getNom());
        assertEquals(candidat.getCompetences(), candidatDto.getCompetences());
        assertEquals(10, candidatDto.getAnneesExperience());
        assertEquals(1, candidatDto.getDisponibilites().size());
        assertEquals("date", candidatDto.getDisponibilites().get(0).getDate());
    }

    @Test
    public void should_map_candidatDto_to_candidatModel() {
        Candidat candidatModel = CandidatMapper.instance.toModel(candidatDto);

        assertNotNull(candidatModel);
        assertEquals(uuidcandidatDto, candidatModel.getUuid());
        assertEquals("Smith", candidatModel.getNom());
        assertEquals(candidat.getCompetences(), candidatModel.getCompetences());
        assertEquals(5, candidatModel.getAnneesExperience());
        assertEquals(1, candidatModel.getDisponibilites().size());
        assertEquals("date", candidatModel.getDisponibilites().get(0).getDate());
    }
}
