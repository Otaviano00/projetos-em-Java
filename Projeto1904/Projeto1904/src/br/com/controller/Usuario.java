
package br.com.controller;

public class Usuario {
    private int id_usuario;
    private String nome;
    private int cpf;
    private String senha;
    private boolean status;

    public Usuario(int id_usuario, String nome, int cpf, String senha, boolean status) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.status = status;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return "\n==== Usuário ===="
                + "\nID: " + getId_usuario()
                + "\nNome: " + getNome()
                + "\nCPF: " + getCpf()
                + "\nSenha: " + getSenha()
                + "\nStatus: " + isStatus();
    }
}
