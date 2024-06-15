package br.com.desafio.literalura.model;

import br.com.desafio.literalura.dto.ResultsDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne(cascade=CascadeType.PERSIST)
    private Autor autor;
    private String idioma;
    private Integer numeroDownloads;

    public Livro() {}

    public Livro(ResultsDTO livros) {
        this.titulo = livros.titulo();
        Autor autores = new Autor(livros.autor().get(0));
        this.autor = autores;
        this.idioma = livros.idioma().get(0);
        this.numeroDownloads = livros.numeroDownloads();
    }

    public Livro(Long id, String titulo, Autor autor, String idioma, Integer numeroDownloads) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.numeroDownloads = numeroDownloads;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public Integer getNumeroDownloads() {
        return numeroDownloads;
    }

    @Override
    public String toString() {
        return "---------------Livro---------------" +
                "\nTítulo: " + titulo +
                "\nAutor: " + autor.getNome() +
                "\nIdioma: " + idioma +
                "\nNumero de Downloads: " + numeroDownloads +
                "\n-----------------------------------";
    }
}
