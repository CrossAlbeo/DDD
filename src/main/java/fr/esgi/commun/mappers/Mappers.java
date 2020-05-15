package fr.esgi.commun.mappers;

import java.util.List;

interface Mappers <D, M> {
    M toModel(D dto);

    List<M> toModel(List<D> dtoList);

    D toDto(M model);

    List<D> toDto(List<M> modelList);
}
