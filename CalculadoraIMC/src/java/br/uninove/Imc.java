package br.uninove;

public class Imc {
    private float peso;
    private float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calculaIMC() {
       float imc = peso / (altura * altura);
       return imc;
    }
    
    //paramos aqui
    
    /*DESAFIO DO TIO:

        Implementar a tabela de classificação baseada em:
        https://arquivos.sbn.org.br/equacoes/eq5.htm
        e mostrar para o usuário a classificação dele
        baseado no resultado do imc

    */
   
}
