package MapperTests;

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


public class RecruteurMapperTests {
    private Recruteur recruteur;
    private RecruteurDto recruteurDto;
    private final UUID uuidCreneau = UUID.randomUUID();
    private final UUID uuidRecruteur = UUID.randomUUID();
    private final UUID uuidRecruteurDto = UUID.randomUUID();
    private final UUID uuidCreneauDto = UUID.randomUUID();


    @BeforeAll
    public void setup() {
        List<Competence> competences = new ArrayList<>();
        competences.add(Competence.Java);
        competences.add(Competence.DotNET);

        List<Creneau> creneaux = new ArrayList<>();
        creneaux.add(new Creneau(uuidCreneau,"date", "14", "15"));
        this.recruteur = new Recruteur(uuidRecruteur,"John", competences, 10, creneaux);

        List<CreneauDto> creneauxDto = new ArrayList<>();
        creneauxDto.add(new CreneauDto(uuidCreneauDto, "dateDebut", "10", "11"));
        this.recruteurDto = new RecruteurDto(uuidRecruteurDto, "Doe", competences, 5, creneauxDto);
    }

    @Test
    public void should_map_to_entity() {
        RecruteurDto dto = RecruteurMapper.instance.toDto(this.recruteur);

        assertNotNull(dto);
        assertEquals(this.recruteur.getUuid(), dto.getUuid());
        assertEquals("John", dto.getName());
        assertEquals(this.recruteur.getCompetences(), dto.getCompetences());
        assertEquals(10, dto.getAnneesExperience());
        assertEquals(1, dto.getDisponibilites().size());
        assertEquals("date", dto.getDisponibilites().get(0).getDate());
    }
}