package mapper_tests;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.ReservationSalleDto;
import fr.esgi.commun.dto.SalleDto;
import fr.esgi.commun.mappers.ReservationSalleMapper;
import fr.esgi.commun.mappers.SalleMapper;
import fr.esgi.model.Creneau;
import fr.esgi.model.ReservationSalle;
import fr.esgi.model.Salle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ReservationSalleMapperTests {
    private static Salle salle;
    private static SalleDto salleDto;
    private static Creneau creneau;
    private static CreneauDto creneauDto;
    private static ReservationSalle reservationSalle;
    private static ReservationSalleDto reservationSalleDto;
    private static final UUID uuidSalle = UUID.randomUUID();
    private static final UUID uuidSalleDto = UUID.randomUUID();
    private static final UUID uuidReservationSalleDto = UUID.randomUUID();
    private static final UUID uuidReservationSalle = UUID.randomUUID();


    @BeforeAll
    static void setup() {
        salle = new Salle(uuidSalle, "22",10,"A");
        creneau = new Creneau( "20/05/15", 14, 15);
        reservationSalle = new ReservationSalle(uuidReservationSalle, salle, creneau);

        salleDto = new SalleDto(uuidSalleDto, "11",20,"B");
        creneauDto = new CreneauDto("20/05/16", 10, 11);
        reservationSalleDto = new ReservationSalleDto(uuidReservationSalleDto, uuidSalleDto, creneauDto);
    }

    @Test
    void should_map_reservationSalleModel_to_reservationSalleDto() {
        ReservationSalleDto uneReservationSalleDto = ReservationSalleMapper.instance.toDto(reservationSalle);
        // CreneauDto unCreneauDto = CreneauMapper.instance.toDto(creneau);

        assertNotNull(uneReservationSalleDto);
        assertEquals(uuidReservationSalle, uneReservationSalleDto.getUuid());
        assertEquals(uuidSalle, uneReservationSalleDto.getUuidSalleDto());
        assertEquals(14, uneReservationSalleDto.getCreneauDto().getHeureDebut());
    }

    @Test
    void should_map_reservationSalleDto_to_reservationSalleModel() {
        ReservationSalle uneReservationSalle = ReservationSalleMapper.instance.toModel(reservationSalleDto, salle);
        //Creneau unCreneauModel = CreneauMapper.instance.toModel(creneauDto);

        assertNotNull(uneReservationSalle);
        assertEquals(uuidReservationSalleDto.toString(), uneReservationSalle.getUuid().toString());
        assertEquals(10, uneReservationSalle.getSalle().getCapacite());
        assertEquals(10, uneReservationSalle.getCreneau().getHeureDebut());
    }
}
