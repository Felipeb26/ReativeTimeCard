package com.batsworks.reactive.service.impl;

import com.batsworks.reactive.controller.PersonaController;
import com.batsworks.reactive.model.PersonaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/persona")
public class PersonaControllerImplements implements PersonaController {

    @Override
    public ResponseEntity<Mono<Void>> save(PersonaRequest persona) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<PersonaRequest>> find(String id) {
        return null;
    }

    @Override
    public ResponseEntity<Flux<PersonaRequest>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Mono<PersonaRequest>> update(String id, PersonaRequest persona) {
        return null;
    }

    @Override
    public ResponseEntity<Mono<Void>> delete(String id) {
        return null;
    }
}
