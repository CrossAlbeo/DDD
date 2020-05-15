package model_tests;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.commun.dto.RecruteurDto;
import fr.esgi.commun.dto.SalleDto;
import fr.esgi.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CandidatTests {

    private static CreneauDto creneauDto;
    private static Entretien entretien;
    private static final UUID uuidEntretien = UUID.randomUUID();
    private static Entretien secondEntretien;
    private static RecruteurDto recruteurDto1;
    private static RecruteurDto recruteurDto2;
    private static final UUID uuidRecruteurDto1 = UUID.randomUUID();
    private static final UUID uuidRecruteurDto2 = UUID.randomUUID();
    private static CandidatDto candidatDto;
    private static final UUID uuidcandidatDto = UUID.randomUUID();
    private static final UUID uuidSalleDto1 = UUID.randomUUID();
    private static final UUID uuidSalleDto2 = UUID.randomUUID();
    private static List<SalleDto> sallesDto;


    @BeforeAll
    static void setup() {

        entretien = new Entretien(uuidEntretien, new Candidat(), new Recruteur(), new ReservationSalle(), new Creneau(), Status.Annule);
        List<Competence> competences1 = new ArrayList<>();
        competences1.add(Competence.Java);
        competences1.add(Competence.PHP);

        List<Competence> competences2 = new ArrayList<>();
        competences2.add(Competence.Java);
        competences2.add(Competence.DotNET);

        sallesDto = new ArrayList<>();
        SalleDto salleDto1 = new SalleDto(uuidSalleDto1, "22",10,"A");
        SalleDto salleDto2 = new SalleDto(uuidSalleDto2,  "11",20,"B");
        sallesDto.add(salleDto1);
        sallesDto.add(salleDto2);

        creneauDto = new CreneauDto("20/05/15", 14, 15);

        List<CreneauDto> creneauxDto = new ArrayList<>();
        creneauxDto.add(new CreneauDto("20/05/15", 10, 17));
        recruteurDto1 = new RecruteurDto(uuidRecruteurDto1, "Smith", competences1, 7, creneauxDto);
        recruteurDto2 = new RecruteurDto(uuidRecruteurDto2, "Doe", competences2, 7, creneauxDto);
        List<RecruteurDto> recruteursDto = new ArrayList<>();
        recruteursDto.add(recruteurDto1);
        recruteursDto.add(recruteurDto2);

        candidatDto = new CandidatDto(uuidcandidatDto, "John", competences2, 5);

        secondEntretien = new Entretien(candidatDto, recruteursDto,creneauDto);
    }

    @Test
    void should_be_created() {
        assertNotNull(entretien);
    }

    @Test
    void should_be_confirmed() {
        entretien.confirmer();
        assertEquals(Status.Confirme, entretien.getStatus());
    }

    @Test
    void should_be_cancelled() {
        entretien.annuler();
        assertEquals(Status.Annule, entretien.getStatus());
    }

    @Test
    void should_be_reported() {
        entretien.reporter();
        assertEquals(Status.Planifie, entretien.getStatus());
    }

    @Test
    void should_be_plan_secondEntretien_with_Doe() {
        secondEntretien.planifier(sallesDto);
        assertEquals("Doe", secondEntretien.getRecruteur().getNom());
    }
}
