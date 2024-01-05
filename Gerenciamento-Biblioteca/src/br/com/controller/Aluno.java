
package br.com.controller;

public class Aluno {
    private String matricula;
    private String nome;
    private String serie;
    private String situacao;

    public Aluno(String matricula, String nome, String serie, String situacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.serie = serie;
        this.situacao = situacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSerie() {
        return serie;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public Object[] toVector() {
        return new Object[] {matricula, nome, serie, situacao};
    }
    
    public String toString() {
        return matricula + " - " + nome + " - " + serie;
    }
       
}
