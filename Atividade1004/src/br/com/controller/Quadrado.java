package br.com.controller;

public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico {

    private Double lado;

    public Quadrado(Double lado, String nome) {
        super(nome);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "\n=== Quadrado ==="
                + "\nNome: " + getNome()
                + "\nLado: " + getLado()
                + "\nÁrea: " + calculaArea()
                + "\nPerímetro: " + calculaPerimetro();
    }

    @Override
    public Double calculaArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public Double calculaPerimetro() {
        return lado * 4;
    }

}
