package com.henriquegc.urlshortnerapi.controller;

import com.henriquegc.urlshortnerapi.domain.urlShortner.dto.CreateUrlShortnerDTO;
import com.henriquegc.urlshortnerapi.service.UrlShortnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlShortenerController {
    @Autowired
    private UrlShortnerService urlShortnerService;

    @GetMapping("/c/{code}")
    public RedirectView getShortenedUrl(@PathVariable String code) {
        return urlShortnerService.getShortenedUrlByCode(code);
    }

    @PostMapping("/")
    public String shortenUrl(@RequestBody CreateUrlShortnerDTO createUrlShortnerDTO) {
        return urlShortnerService.shortenUrl(createUrlShortnerDTO);
    }
}
