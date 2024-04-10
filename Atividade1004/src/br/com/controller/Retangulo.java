package br.com.controller;

public class Retangulo extends FiguraGeometrica implements ObjetoGeometrico {

    private Double ladoMaior;
    private Double ladoMenor;

    public Retangulo(Double ladoMaior, Double ladoMenor, String nome) {
        super(nome);
        this.ladoMaior = ladoMaior;
        this.ladoMenor = ladoMenor;
    }

    public Double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(Double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }

    public Double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(Double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    @Override
    public String toString() {
        return "\n=== Retângulo ==="
                + "\nNome: " + getNome()
                + "\nLado Maior: " + getLadoMaior()
                + "\nLado Menor: " + getLadoMenor()
                + "\nÁrea: " + calculaArea()
                + "\nPerímetro: " + calculaPerimetro();
    }

    @Override
    public Double calculaArea() {
        return ladoMenor * ladoMaior;
    }

    @Override
    public Double calculaPerimetro() {
        return 2 * ladoMaior + 2 * ladoMenor;
    }
}
