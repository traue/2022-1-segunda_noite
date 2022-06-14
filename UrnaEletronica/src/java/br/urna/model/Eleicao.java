package br.urna.model;

public class Eleicao {

    private int idEleicao;
    private String nomeEleicao;
    private String descricao;

    public Eleicao() {
    }

    public Eleicao(int idEleicao, String nomeEleicao, String descricao) {
        this.idEleicao = idEleicao;
        this.nomeEleicao = nomeEleicao;
        this.descricao = descricao;
    }

    public int getIdEleicao() {
        return idEleicao;
    }

    public void setIdEleicao(int idEleicao) {
        this.idEleicao = idEleicao;
    }

    public String getNomeEleicao() {
        return nomeEleicao;
    }

    public void setNomeEleicao(String nomeEleicao) {
        this.nomeEleicao = nomeEleicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
