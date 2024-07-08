package me.dio.domain.dto;

// Interface funcional para converter entidades em DTOs
@FunctionalInterface
public interface EntityToDtoConverter<E, T> {

    T convert(E entity);
    
}
