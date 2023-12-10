package com.henriquegc.urlshortnerapi.repository;

import com.henriquegc.urlshortnerapi.domain.urlShortner.entity.UrlShortnerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UrlShortnerRepository extends MongoRepository<UrlShortnerEntity, String> {
    Optional<UrlShortnerEntity> findByCode(String code);
}
