package com.batsworks.reactive.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Builder
@Document
public class Persona {

    @Id
    private String id;
    private String nome;
    @Indexed(unique = true)
    private String email;
    private String password;
    private LocalDate dataNascimento;

}
