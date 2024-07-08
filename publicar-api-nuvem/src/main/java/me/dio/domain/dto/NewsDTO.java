package me.dio.domain.dto;

import java.util.List;
import me.dio.domain.model.News;

public class NewsDTO implements BaseItemDTO {

    // private Long id;
    private String icon;
    private String description;

    public NewsDTO(News news) {
        // this.id = feature.getId();
        this.icon = news.getIcon();
        this.description = news.getDescription();
    }

    // Getters e setters
    public String getIcon() {
        return this.icon;
    }

    public String getDescription() {
        return this.description;
    }

    public static List<NewsDTO> getListDTO(List<News> news) {
        return BaseItemDTO.getListDTO(news, NewsDTO::new);
    }

}