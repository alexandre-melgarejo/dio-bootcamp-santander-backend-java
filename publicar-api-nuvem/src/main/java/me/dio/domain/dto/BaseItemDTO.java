package me.dio.domain.dto;

import java.util.List;

public interface BaseItemDTO {

    // Long getId();
    String getIcon();
    String getDescription();

    static <T extends BaseItemDTO, E> List<T> getListDTO(List<E> entities, EntityToDtoConverter<E, T> converter) {
        return entities.stream()
                .map(converter::convert)
                .toList();
    }    
}
