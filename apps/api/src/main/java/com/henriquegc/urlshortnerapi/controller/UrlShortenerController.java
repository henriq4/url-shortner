package com.henriquegc.urlshortnerapi.controller;

import com.henriquegc.urlshortnerapi.service.UrlShortnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlShortenerController {
    @Autowired
    private UrlShortnerService urlShortnerService;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/{code}")
    public RedirectView getShortenedUrlaaaa(@PathVariable String code) {
        return urlShortnerService.getShortenedUrlByCode(code);
    }

    @GetMapping("/c/{code}")
    public RedirectView getShortenedUrl(@PathVariable String code) {
        return urlShortnerService.getShortenedUrlByCode(code);
    }

    @PostMapping("/")
    public String shortenUrl() {
        return urlShortnerService.shortenUrl();
    }
}
