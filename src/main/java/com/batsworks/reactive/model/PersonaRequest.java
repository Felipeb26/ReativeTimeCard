package com.batsworks.reactive.model;

import java.time.LocalDate;

public record PersonaRequest(
        String nome,
        String email,
        String password,
        LocalDate dataNascimento
) {
}
