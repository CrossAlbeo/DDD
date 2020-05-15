package fr.esgi.commun.mappers;

import org.mapstruct.Mapper;

import java.util.List;

public interface Mappers <D, M> {
    M toModel(D dto);

    List<M> toModel(List<D> dtoList);

    D toDto(M model);

    List<D> toDto(List<M> modelList);
}
