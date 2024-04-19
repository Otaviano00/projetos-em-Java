
package br.com.controller;


public class Usuario_Produto {
    private int id_usuario_produto;
    private Usuario usuario;
    private Produto produto;

    public Usuario_Produto(int id_usuario_produto, Usuario usuario, Produto produto) {
        this.id_usuario_produto = id_usuario_produto;
        this.usuario = usuario;
        this.produto = produto;
    }

    public int getId_usuario_produto() {
        return id_usuario_produto;
    }

    public void setId_usuario_produto(int id_usuario_produto) {
        this.id_usuario_produto = id_usuario_produto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n-------- Usuario-Produto ----------"
                + "\nID: " + getId_usuario_produto()
                + getUsuario()
                + getProduto();
                
    }
}
