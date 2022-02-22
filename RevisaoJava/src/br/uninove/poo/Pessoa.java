package br.uninove.poo;

//nome da Classe "Pessoa" (que tornar-se-a Objeto em tempo de execução)
public class Pessoa {

    private String nome;
    private String cpf;
    private String email;
    private char sexo;
    private int idade;
    
             //Assinatura deste método: String, string, string, char, int
    public Pessoa(String nome, String cpf, String email, char sexo, int idade) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setSexo(sexo);
        setIdade(idade);
    }
    
    //subrecarga do método construtor:
    public Pessoa() { }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //aplicar o encapsulmaento: 
    //1 - private nos atribus
    //2 - Criar um get (retorno) para cada atributo
    //3 - Criarum set (alteração) para cada atributo
    //Métodos (comportamentos)
    //método do aniversário
    //este método não retorna nada para quem 
    //o acionar (void) assim como não possui 
    //nenhuma entrada de atributo
    void fazerAniversario() {
        setIdade(getIdade() + 1); //idade = idade + 1;
        System.out.println("Ôba festinha. Quero bolo!");
    }
    
    //falta criarmos objetos derivados de pessoa.
}
