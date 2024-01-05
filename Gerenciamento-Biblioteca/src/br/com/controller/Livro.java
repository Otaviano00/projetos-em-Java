
package br.com.controller;

public class Livro {
    private String codigo;
    private String nome;
    private String autor;
    private String situacao;

    public Livro(String codigo, String nome, String autor, String situacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.situacao = situacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
 
    public Object[] toVector() {
        return new Object[] {codigo, nome, autor, situacao};
    }
    
    public String toString() {
        return codigo + " - " + nome;
    }
}
