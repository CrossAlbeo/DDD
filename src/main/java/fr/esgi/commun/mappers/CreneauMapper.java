package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.model.Creneau;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CreneauMapper extends fr.esgi.commun.mappers.Mappers<CreneauDto, Creneau> {
    CreneauMapper instance = Mappers.getMapper(CreneauMapper.class);

    Creneau toModel(CreneauDto creneauDto);

    List<Creneau> toModel(List<CreneauDto> creneauxDto);

    CreneauDto toDto(Creneau creneau);

    List<CreneauDto> toDto(List<Creneau> creneaux);
}
