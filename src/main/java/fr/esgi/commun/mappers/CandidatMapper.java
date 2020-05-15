package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.model.Candidat;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface CandidatMapper extends fr.esgi.commun.mappers.Mappers<CandidatDto, Candidat> {
    CandidatMapper instance = Mappers.getMapper(CandidatMapper.class);

    Candidat toModel(CandidatDto candidatDto);

    List<Candidat> toModel(List<CandidatDto> candidatsDto);

    CandidatDto toDto(Candidat candidat);

    List<CandidatDto> toDto(List<Candidat> candidats);
}
