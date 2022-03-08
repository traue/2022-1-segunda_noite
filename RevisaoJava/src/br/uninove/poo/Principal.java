package br.uninove.poo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //"p" é um objeto do tipo "Pessoa"
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        p.setNome(sc.nextLine());
        
        System.out.print("Informe seu CPF: ");
        p.setCpf(sc.nextLine());
        
        System.out.print("Informe sua idade: ");
        p.setIdade(Integer.parseInt(sc.nextLine()));
        
        System.out.print("Informe seu e-mail: ");
        p.setEmail(sc.nextLine());
        
        System.out.print("Informe seu sexo: ");
        p.setSexo(sc.next().charAt(0)); //pega apenas o primeiro char do que o usuário inserir
        
        
        System.out.println("O(a) " + p.getNome() + " tem " + p.getIdade() + " anos");
        
        p.fazerAniversario();
        
        System.out.println("O(a) " + p.getNome() + " agora tem " + p.getIdade() + " anos");
        
        Pessoa p2 = new Pessoa("Thiago", "123412121", "thiago.tr.@ojk", 'M', 34);
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Roberth");
        a1.setIdade(20);
        a1.setEmail("roro@uni9.edu.br");
        a1.setCurso("Sistemas de Informação");
        a1.setRa(123123);
        
        Aluno a2 = new Aluno("Fulano", "12312", "bla@bla.com", 'R', 
                19, 123123, "TADS");
      
    }
}
