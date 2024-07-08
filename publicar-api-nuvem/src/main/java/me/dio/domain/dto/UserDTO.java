package me.dio.domain.dto;

import java.net.URI;
import java.util.List;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import jakarta.servlet.http.HttpServletRequest;
import me.dio.domain.model.User;

public class UserDTO {

    private Long id;
    private String name;
    private AccountDTO account;
    private CardDTO card;
    private List<FeatureDTO> features;
    private List<NewsDTO> news;
    private URI location;

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.account = new AccountDTO(user.getAccount());
        this.card = new CardDTO(user.getCard());
        this.features = FeatureDTO.getListDTO(user.getFeatures());
        this.news = NewsDTO.getListDTO(user.getNews());
        this.setLocation();
    }

    public Long getId() {
        return this.id;
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

    private void setLocation() {
        List<String> segments = ServletUriComponentsBuilder.fromCurrentRequest().build().getPathSegments();
        if (!segments.isEmpty()) {
            String lastSegment = segments.get(segments.size() - 1);
            try {
                Long idFromUri = Long.parseLong(lastSegment);
                if (idFromUri.equals(this.id)) {
                    this.location = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
                } else {
                    this.location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                                            .buildAndExpand(this.id)
                                            .toUri();
                }
            } catch (NumberFormatException e) {
                this.location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(this.id)
                                    .toUri();
            }
        } else {
            this.location = null;
        }
    }

}
