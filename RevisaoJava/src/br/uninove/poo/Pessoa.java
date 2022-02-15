package br.uninove.poo;

//nome da Classe "Pessoa" (que tornar-se-a Objeto em tempo de execução)
public class Pessoa {

    //Atributos (características) ~ variáveis
    String nome, cpf, email;
    char sexo;
    int idade;

    //Métodos (comportamentos)
    //método do aniversário
    //este método não retorna nada para quem 
    //o acionar (void) assim como não possui 
    //nenhuma entrada de atributo
    void fazerAniversario() {
        idade++; //idade = idade + 1;
        System.out.println("Ôba festinha. Quero bolo!");
        //System.out.println("Agora " + nome + " tem " + idade + " anos!");
    }
}
