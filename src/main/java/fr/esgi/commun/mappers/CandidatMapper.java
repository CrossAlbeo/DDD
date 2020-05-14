package fr.esgi.commun.mappers;

import fr.esgi.commun.dto.CandidatDto;
import fr.esgi.model.Candidat;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CandidatMapper extends fr.esgi.commun.mappers.Mappers<CandidatDto, Candidat> {
    CandidatMapper instance = Mappers.getMapper(CandidatMapper.class);

    Candidat toModel(CandidatDto candidatDto);
}
