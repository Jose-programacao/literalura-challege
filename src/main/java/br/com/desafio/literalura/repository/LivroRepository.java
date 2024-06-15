package br.com.desafio.literalura.repository;

import br.com.desafio.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    @Query("SELECT i FROM Livro i WHERE i.idioma LIKE %:idiomaEscolhido%")
    List<Livro> findAllByIdioma(String idiomaEscolhido);
}
