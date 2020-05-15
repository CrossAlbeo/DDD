package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.EntretienDto;
import fr.esgi.model.Entretien;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EntretienMapper extends fr.esgi.commun.mappers.Mappers<EntretienDto, Entretien> {
    EntretienMapper instance = Mappers.getMapper(EntretienMapper.class);

    @Mapping(target = "uuidCandidat", source = "candidat.uuid")
    @Mapping(target = "uuidRecruteur", source = "recruteur.uuid")
    @Mapping(target = "uuidReservationSalle", source = "reservationSalle.uuid")
    @Mapping(target = "creneauDto", source = "creneau")
    EntretienDto toDto(Entretien entretien);

    List<EntretienDto> toDto(List<Entretien> entretiens);
}

