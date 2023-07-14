package com.batsworks.reactive.controller;

import com.batsworks.reactive.model.PersonaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaController {

    @PostMapping
    ResponseEntity<Mono<Void>> save(@RequestBody PersonaRequest persona);

    @GetMapping(value = "/{id}")
    ResponseEntity<Mono<PersonaRequest>> find(@PathVariable String id);

    @GetMapping
    ResponseEntity<Flux<PersonaRequest>> findAll();

    @PatchMapping("{id}")
    ResponseEntity<Mono<PersonaRequest>> update(@PathVariable String id, @RequestBody PersonaRequest persona);

    @DeleteMapping("{id}")
    ResponseEntity<Mono<Void>> delete(@PathVariable String id);

}
