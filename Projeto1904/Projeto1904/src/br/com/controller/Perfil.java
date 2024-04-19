
package br.com.controller;


public class Perfil {
    private int id_perfil;
    private String nome;
    private boolean status;

    public Perfil(int id_perfil, String nome, boolean status) {
        this.id_perfil = id_perfil;
        this.nome = nome;
        this.status = status;
    }

    public Perfil() {
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
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
        return "\n===== Perfil ====="
                + "\nID: " + getId_perfil()
                + "\nNome: " + getNome()
                + "\nStatus: " + isStatus();
    }
}
