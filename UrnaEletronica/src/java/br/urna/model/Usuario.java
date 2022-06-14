package br.urna.model;

public class Usuario {

    private int idUsuario;
    private String usuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(int idUsuario, String usuario, String senha) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
