package com.henriquegc.urlshortnerapi.service;

import com.henriquegc.urlshortnerapi.domain.urlShortner.dto.CreateUrlShortnerDTO;
import com.henriquegc.urlshortnerapi.domain.urlShortner.entity.UrlShortnerEntity;
import com.henriquegc.urlshortnerapi.repository.UrlShortnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.RedirectView;

import java.util.UUID;

@Service
public class UrlShortnerService {

    @Autowired
    private UrlShortnerRepository repository;

    public String shortenUrl(CreateUrlShortnerDTO createUrlShortnerDTO) {
        String code = UUID.randomUUID().toString().substring(0, 6);

        UrlShortnerEntity urlShortnerEntity = new UrlShortnerEntity(code, createUrlShortnerDTO.url());

        repository.insert(urlShortnerEntity);

        return code;
    }

    public RedirectView getShortenedUrlByCode(String code) {
        UrlShortnerEntity urlShortnerEntity = repository.findByCode(code).orElseThrow(() -> new RuntimeException("Code not found"));

        String url = urlShortnerEntity.getUrl();

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);

        System.out.println("Redirecting to " + url);
        System.out.println(urlShortnerEntity.getCode());

        return redirectView;
    }
}
