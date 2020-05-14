package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.CreneauDto;
import fr.esgi.model.Creneau;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CreneauMapper extends fr.esgi.commun.mappers.Mappers<CreneauDto, Creneau> {
    CreneauMapper instance = Mappers.getMapper(CreneauMapper.class);

    Creneau toModel(CreneauDto creneauDto);
}
