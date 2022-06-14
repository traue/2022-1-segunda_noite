package br.urna.model;

public class Candidato {

    private int idCandidado;
    private int idEleicao;
    private String nomeCandidato;

    public Candidato() {
    }

    public Candidato(int idCandidado, int idEleicao, String nomeCandidato) {
        this.idCandidado = idCandidado;
        this.idEleicao = idEleicao;
        this.nomeCandidato = nomeCandidato;
    }

    public int getIdCandidado() {
        return idCandidado;
    }

    public void setIdCandidado(int idCandidado) {
        this.idCandidado = idCandidado;
    }

    public int getIdEleicao() {
        return idEleicao;
    }

    public void setIdEleicao(int idEleicao) {
        this.idEleicao = idEleicao;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }
}
