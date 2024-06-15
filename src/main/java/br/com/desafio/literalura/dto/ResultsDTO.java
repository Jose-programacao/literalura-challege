package br.com.desafio.literalura.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultsDTO(@JsonAlias("title") String titulo,
                         @JsonAlias("authors") List<AutorDTO> autor,
                         @JsonAlias("languages") List<String> idioma,
                         @JsonAlias("download_count") Integer numeroDownloads) {
}
