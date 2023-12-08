package com.henriquegc.urlshortnerapi.domain.entity;

public class UrlShortnerEntity {


    private String id;

    private String code;

    private String url;

    public UrlShortnerEntity(String id, String code, String url) {
        this.id = id;
        this.code = code;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
