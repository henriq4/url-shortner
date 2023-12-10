package com.henriquegc.urlshortnerapi.domain.urlShortner.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UrlShortnerEntity {
    @Id
    private String id;

    @Getter
    @Setter
    @Indexed(unique = true)
    private String code;

    @Getter
    @Setter
    private String url;

    public UrlShortnerEntity(String code, String url) {
        this.code = code;
        this.url = url;
    }
}
