package mapper_tests;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;
import fr.esgi.commun.mappers.RecruteurMapper;
import fr.esgi.model.Competence;
import fr.esgi.model.Creneau;
import fr.esgi.model.Recruteur;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class RecruteurMapperTests {
    private static Recruteur recruteur;
    private static RecruteurDto recruteurDto;
    private static final UUID uuidRecruteur = UUID.randomUUID();
    private static final UUID uuidRecruteurDto = UUID.randomUUID();

    @BeforeAll
    static void setup() {
        List<Competence> competences = new ArrayList<>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        List<Creneau> creneaux = new ArrayList<>();
        creneaux.add(new Creneau("date", 14, 15));
        recruteur = new Recruteur(uuidRecruteur,"John", competences, 10, creneaux);

        List<CreneauDto> creneauxDto = new ArrayList<>();
        creneauxDto.add(new CreneauDto("dateDebut", 10, 11));
        recruteurDto = new RecruteurDto(uuidRecruteurDto, "Doe", competences, 5, creneauxDto);
    }

    @Test
    void should_map_to_dto() {
        RecruteurDto dto = RecruteurMapper.instance.toDto(recruteur);

        assertNotNull(dto);
        assertEquals(recruteur.getUuid(), dto.getUuid());
        assertEquals("John", dto.getNom());
        assertEquals(2, dto.getCompetences().size());
        assertEquals(recruteur.getCompetences(), dto.getCompetences());
        assertEquals(10, dto.getAnneesExperience());
        assertEquals(1, dto.getDisponibilites().size());
        assertEquals("date", dto.getDisponibilites().get(0).getDate());
    }

    @Test
    void should_map_to_model() {
        Recruteur recruteur = RecruteurMapper.instance.toModel(recruteurDto);

        assertNotNull(recruteur);
        assertEquals(uuidRecruteurDto.toString(), recruteur.getUuid().toString());
        assertEquals("Doe", recruteur.getNom());
        assertEquals(2, recruteur.getCompetences().size());
        assertEquals(recruteur.getCompetences(), recruteur.getCompetences());
        assertEquals(5, recruteur.getAnneesExperience());
        assertEquals(1, recruteur.getDisponibilites().size());
        assertEquals("dateDebut", recruteur.getDisponibilites().get(0).getDate());
    }
}
