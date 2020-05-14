package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.SalleDto;
import fr.esgi.model.Salle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SalleMapper extends fr.esgi.commun.mappers.Mappers<SalleDto, Salle> {
    SalleMapper instance = Mappers.getMapper(SalleMapper.class);

    Salle toModel(SalleDto salleDto);

    List<Salle> toModel(List<SalleDto> sallesDto);

    SalleDto toDto(Salle salle);

    List<SalleDto> toDto(List<Salle> salles);
}

