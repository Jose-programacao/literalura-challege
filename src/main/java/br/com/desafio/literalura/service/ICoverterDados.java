package br.com.desafio.literalura.service;

public interface ICoverterDados {
    <T> T obterDados(String json, Class<T> classe);
}
