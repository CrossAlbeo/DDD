package mapper_tests;

import fr.esgi.commun.dto.CreneauDto;

import fr.esgi.commun.mappers.CreneauMapper;
import fr.esgi.model.Creneau;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CreneauMapperTests {

    private static List<Creneau> creneaux;
    private static List<CreneauDto> creneauxDto;
    private static final UUID uuidCreneau = UUID.randomUUID();
    private static final UUID uuidCreneauDto = UUID.randomUUID();

    @BeforeAll
    static void setup() {
        creneaux = new ArrayList<>();
        creneaux.add(new Creneau("20/05/15", 14, 15));

        creneauxDto = new ArrayList<>();
        creneauxDto.add(new CreneauDto("20/05/16", 10, 11));
    }

    @Test
    void should_map_listCreneauxModel_to_listCreneauxDto() {

        List<CreneauDto> creneauxDto = CreneauMapper.instance.toDto(creneaux);
        assertNotNull(creneauxDto);
        assertEquals("20/05/15", creneauxDto.get(0).getDate());
        assertEquals(14, creneauxDto.get(0).getHeureDebut());
        assertEquals(15, creneauxDto.get(0).getHeureFin());
    }

    @Test
    void should_map_creneauxDto_to_creneauxModel() {

        List<Creneau> creneauxModel = CreneauMapper.instance.toModel(creneauxDto);
        assertNotNull(creneauxModel);
        assertEquals("20/05/16", creneauxModel.get(0).getDate());
        assertEquals(10, creneauxModel.get(0).getHeureDebut());
        assertEquals(11, creneauxModel.get(0).getHeureFin());
    }
}
