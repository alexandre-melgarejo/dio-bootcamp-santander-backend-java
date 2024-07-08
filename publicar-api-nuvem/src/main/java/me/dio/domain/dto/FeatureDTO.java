package me.dio.domain.dto;

import java.util.List;
import me.dio.domain.model.Feature;

public class FeatureDTO implements BaseItemDTO {

    // private Long id;
    private String icon;
    private String description;

    public FeatureDTO(Feature feature) {
        // this.id = feature.getId();
        this.icon = feature.getIcon();
        this.description = feature.getDescription();
    }

    // Getters e setters
    public String getIcon() {
        return this.icon;
    }

    public String getDescription() {
        return this.description;
    }

    public static List<FeatureDTO> getListDTO(List<Feature> features) {
        return BaseItemDTO.getListDTO(features, FeatureDTO::new);
    }

}
