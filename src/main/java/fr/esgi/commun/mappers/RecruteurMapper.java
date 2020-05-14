package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.RecruteurDto;
import fr.esgi.model.Recruteur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecruteurMapper extends fr.esgi.commun.mappers.Mappers<RecruteurDto, Recruteur> {
    RecruteurMapper instance = Mappers.getMapper(RecruteurMapper.class);

    Recruteur toModel(RecruteurDto recruteurDto);
}
