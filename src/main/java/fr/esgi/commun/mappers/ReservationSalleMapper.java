package fr.esgi.commun.mappers;


import fr.esgi.commun.dto.ReservationSalleDto;
import fr.esgi.model.ReservationSalle;
import fr.esgi.model.Salle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ReservationSalleMapper extends fr.esgi.commun.mappers.Mappers<ReservationSalleDto, ReservationSalle> {
    ReservationSalleMapper instance = Mappers.getMapper(ReservationSalleMapper.class);

    default ReservationSalle toModel(ReservationSalleDto reservationSalleDto, Salle salle) {
        return new ReservationSalle(reservationSalleDto.getUuid(), salle);
    }

    List<ReservationSalle> toModel(List<ReservationSalleDto> reservationsSalleDto, List<Salle> salles);

    @Mapping(target = "uuidSalle", source = "salle.uuid")
    ReservationSalleDto toDto(ReservationSalle reservationSalle);

    List<ReservationSalleDto> toDto(List<ReservationSalle> reservationsSalle);
}
