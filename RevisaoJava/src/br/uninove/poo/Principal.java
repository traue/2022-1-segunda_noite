package br.uninove.poo;

public class Principal {

    public static void main(String[] args) {

        //"p" é um objeto do tipo "Pessoa"
        Pessoa p = new Pessoa();
        
        p.nome = "Thiago G. Traue";
        p.cpf = "123.123.123.00";
        p.idade = 34;
        p.sexo = 'M';
        p.email = "thiago.traue@uni9.pro.br";
        
        System.out.println("O " + p.nome + " tem " + p.idade + " anos");
        
        p.fazerAniversario();
        
        System.out.println("O " + p.nome + " agora tem " + p.idade + " anos");
    }
}
