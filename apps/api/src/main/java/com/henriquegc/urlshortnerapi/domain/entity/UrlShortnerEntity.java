package com.henriquegc.urlshortnerapi.domain.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class UrlShortnerEntity {
    @Id
    private String id;

    @Indexed(unique = true)
    private String code;

    private String url;

    public UrlShortnerEntity(String code, String url) {
        this.code = code;
        this.url = url;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
