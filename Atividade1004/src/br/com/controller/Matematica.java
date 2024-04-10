
package br.com.controller;

public class Matematica extends Disciplina {
    private Double cargaHoraria;
    private AplicacaoPratica aplicacaoPratica;

    public Matematica(String nome, Double cargaHoraria, AplicacaoPratica aplicacaoPratica) {
        super(nome);
        this.cargaHoraria = cargaHoraria;
        this.aplicacaoPratica = aplicacaoPratica;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public AplicacaoPratica getAplicacaoPratica() {
        return aplicacaoPratica;
    }

    public void setAplicacaoPratica(AplicacaoPratica aplicacaoPratica) {
        this.aplicacaoPratica = aplicacaoPratica;
    }
    
    @Override
    public String toString() {
        return "\n=-=-=-=-= Matemática =-=-=-=-=-="
                + "\nCarga Horária: " + getCargaHoraria()
                + aplicacaoPratica;
    }
    
    
}
