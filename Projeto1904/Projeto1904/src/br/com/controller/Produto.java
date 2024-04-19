
package br.com.controller;


public class Produto {
    private int id_produto;
    private String nome;
    private boolean status;

    public Produto(int id_produto, String nome, boolean status) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.status = status;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "\n===== Produto ======"
                + "\nID: " + getId_produto()
                + "\nNome: " + getNome()
                + "\nStatus: " + isStatus();
    }
}
