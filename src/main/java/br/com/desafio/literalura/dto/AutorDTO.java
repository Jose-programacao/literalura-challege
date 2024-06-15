package br.com.desafio.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AutorDTO(@JsonAlias("name") String nome,
                       @JsonAlias("birth_year") Integer dataNascimento,
                       @JsonAlias("death_year") Integer dataFalecimento) {
}
