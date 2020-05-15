package fr.esgi.commun.mappers;


import fr.esgi.commun.dto.ReservationSalleDto;
import fr.esgi.model.ReservationSalle;
import fr.esgi.model.Salle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface ReservationSalleMapper extends fr.esgi.commun.mappers.Mappers<ReservationSalleDto, ReservationSalle> {
    ReservationSalleMapper instance = Mappers.getMapper(ReservationSalleMapper.class);

    default ReservationSalle toModel(ReservationSalleDto reservationSalleDto, Salle salle) {
        return new ReservationSalle(reservationSalleDto.getUuid(), salle, CreneauMapper.instance.toModel(reservationSalleDto.getCreneauDto()));
    }

    default List<ReservationSalle> toModel(List<ReservationSalleDto> reservationsSalleDto, List<Salle> salles) {
        List<ReservationSalle> reservationsSalle = new ArrayList<>();
        for (int i = 0; i < reservationsSalleDto.size(); i++) {
            reservationsSalle.add(new ReservationSalle(reservationsSalleDto.get(i).getUuid(),
                    salles.get(i), CreneauMapper.instance.toModel(reservationsSalleDto.get(0).getCreneauDto())));
        }
        return reservationsSalle;
    }

    @Mapping(target = "uuidSalleDto", source = "salle.uuid")
    @Mapping(target = "creneauDto", source = "creneau")
    ReservationSalleDto toDto(ReservationSalle reservationSalle);

    List<ReservationSalleDto> toDto(List<ReservationSalle> reservationsSalle);
}
