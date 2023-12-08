package com.henriquegc.urlshortnerapi.service;

import com.henriquegc.urlshortnerapi.domain.entity.UrlShortnerEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Service
public class UrlShortnerService {
     private ArrayList<UrlShortnerEntity> urlShortnerEntity;

    public String shortenUrl() {
        UrlShortnerEntity urlShortnerEntity = new UrlShortnerEntity("kdjaskdjsaadsjk", "hsadsan", "https://www.google.com");

        System.out.println("Shortened URL: " + urlShortnerEntity.getCode());

        return urlShortnerEntity.getCode();
    }

    public RedirectView getShortenedUrlByCode(String shortenedUrl) {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("https://www.google.com");
        return redirectView;
    }
}
