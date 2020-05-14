package fr.esgi.commun.mappers;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper()
public interface Mappers <D, M> {
    M toModel(D dto);
    List<M> toModel(List<D> dtoList);
}
