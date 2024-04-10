
package br.com.controller;

public abstract class FiguraGeometrica { 
    private String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public abstract String toString();
    
}
