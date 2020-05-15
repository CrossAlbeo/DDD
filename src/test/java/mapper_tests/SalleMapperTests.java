package mapper_tests;

import fr.esgi.commun.dto.SalleDto;
import fr.esgi.commun.mappers.SalleMapper;
import fr.esgi.model.Salle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SalleMapperTests {
    private static Salle salle;
    private static SalleDto salleDto;
    private static final UUID uuidSalle = UUID.randomUUID();
    private static final UUID uuidSalleDto = UUID.randomUUID();

    @BeforeAll
    public static void setup() {
        salle = new Salle(uuidSalle, "22",10,"A");
        salleDto = new SalleDto(uuidSalleDto,  "11",20,"B");
    }

    @Test
    public void should_map_salleModel_to_salleDto() {
        SalleDto uneSalleDto = SalleMapper.instance.toDto(salle);

        assertNotNull(uneSalleDto);
        assertEquals(uuidSalle, uneSalleDto.getUuid());
        assertEquals("22", uneSalleDto.getNumero());
        assertEquals(10, uneSalleDto.getCapacite());
        assertEquals("A",uneSalleDto.getBatiment());
    }

    @Test
    public void should_map_salleDto_to_salleModel() {
        Salle uneSalleModel = SalleMapper.instance.toModel(salleDto);

        assertNotNull(uneSalleModel);
        assertEquals(uuidSalleDto, uneSalleModel.getUuid());
        assertEquals("11", uneSalleModel.getNumero());
        assertEquals(20, uneSalleModel.getCapacite());
        assertEquals("B",uneSalleModel.getBatiment());

    }
}
