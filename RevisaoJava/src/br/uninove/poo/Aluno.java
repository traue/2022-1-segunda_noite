package br.uninove.poo;

//extends = herança, ou seja
//o aluno tem TUDO que a pessoa possui
//mais suas próprias características
                    //é
public class Aluno extends Pessoa {
    private int ra;
    private String curso;
    
    public Aluno() {
        super();
    }
    
    public Aluno(String nome, String cpf, String email, char sexo, int idade, 
            int ra, String curso) {
        super(nome, cpf, email, sexo, idade); //chama o construtor da classe herdada
        this.curso = curso;
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
