
package br.com.controller;


public class Usuario_Perfil {
    private int id_usuario_perfil;
    private Usuario usuario;
    private Perfil perfil;

    public Usuario_Perfil(int id_usuario_perfil, Usuario usuario, Perfil perfil) {
        this.id_usuario_perfil = id_usuario_perfil;
        this.usuario = usuario;
        this.perfil = perfil;
    }

    public int getId_usuario_perfil() {
        return id_usuario_perfil;
    }

    public void setId_usuario_perfil(int id_usuario_perfil) {
        this.id_usuario_perfil = id_usuario_perfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    
    @Override
    public String toString() {
        return "\n-------- Usuario-Perfil ----------"
                + "\nID: " + getId_usuario_perfil()
                + getUsuario()
                + getPerfil();
                
    }
}
