package me.dio.domain.dto;

import java.net.URI;
import java.util.List;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.User;

public class UserDTO {

    // private Long id;
    private String name;
    private AccountDTO account;
    private CardDTO card;
    private List<FeatureDTO> features;
    private List<NewsDTO> news;
    private URI location;

    public UserDTO(User user) {
        // this.id = user.getId();
        this.name = user.getName();
        this.account = new AccountDTO(user.getAccount());
        this.card = new CardDTO(user.getCard());
        this.features = FeatureDTO.getListDTO(user.getFeatures());
        this.news = NewsDTO.getListDTO(user.getNews());
        this.location = ServletUriComponentsBuilder.fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(user.getId())
                            .toUri();

    }

    public String getName() {
        return this.name;
    }

    public AccountDTO getAccount() {
        return this.account;
    }

    public CardDTO getCard() {
        return this.card;
    }

    public List<FeatureDTO> getFeatures() {
        return this.features;
    }

    public List<NewsDTO> getNews() {
        return this.news;
    }

    public URI getLocation() {
        return this.location;
    }

}
