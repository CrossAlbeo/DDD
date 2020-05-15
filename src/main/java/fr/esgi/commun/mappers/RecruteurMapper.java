package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.RecruteurDto;
import fr.esgi.model.Recruteur;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(imports = UUID.class)
public interface RecruteurMapper extends fr.esgi.commun.mappers.Mappers<RecruteurDto, Recruteur> {
    RecruteurMapper instance = Mappers.getMapper(RecruteurMapper.class);

    Recruteur toModel(RecruteurDto recruteurDto);

    List<Recruteur> toModel(List<RecruteurDto> recruteursDto);

    RecruteurDto toDto(Recruteur recruteur);

    List<RecruteurDto> toDto(List<Recruteur> recruteurs);
}
