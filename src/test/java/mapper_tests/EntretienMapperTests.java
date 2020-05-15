package mapper_tests;

import fr.esgi.commun.dto.EntretienDto;
import fr.esgi.commun.mappers.EntretienMapper;
import fr.esgi.model.Entretien;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class EntretienMapperTests {
    private static Entretien entretien;
    private static EntretienDto entretienDto;
    private static final UUID uuidEntretien = UUID.randomUUID();
    private static final UUID uuidcEntretienDto = UUID.randomUUID();

    @BeforeAll
    public static void  setup() {

        Entretien entretien = new Entretien();

        EntretienDto entretienDto = new EntretienDto();

    }

    @Test
    public void should_map_entretienModel_to_entretienDto() {
        EntretienDto entretienDto = EntretienMapper.instance.toDto(entretien);

        //assertNotNull(entretienDto);

    }

    @Test
    public void should_map_entretienDto_to_entretienModel() {
        Entretien entretienModel = EntretienMapper.instance.toModel(entretienDto);

        //assertNotNull(entretienModel);
    }
}
