package com.batsworks.reactive.repository;

import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonaRepository {

    private ReactiveMongoTemplate reactiveMongoTemplate;

}
