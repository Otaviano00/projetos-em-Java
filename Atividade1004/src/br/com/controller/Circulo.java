package br.com.controller;

public class Circulo extends FiguraGeometrica implements ObjetoGeometrico {

    private Double raio;

    public Circulo(Double raio, String nome) {
        super(nome);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "\n=== Círculo ==="
                + "\nNome: " + getNome()
                + "\nRaio: " + getRaio()
                + "\nÁrea: " + calculaArea()
                + "\nPerímetro: " + calculaPerimetro();
    }

    @Override
    public Double calculaArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public Double calculaPerimetro() {
        return 2 * getRaio() * Math.PI;
    }
}
