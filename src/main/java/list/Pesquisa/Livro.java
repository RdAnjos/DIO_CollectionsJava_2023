package main.java.list.Pesquisa;

import java.security.PublicKey;

public class Livro {
    public String autor;
    public String titulo;
    public int anoPublicacao;

    public Livro(String titulo,String autor ,int anoPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
