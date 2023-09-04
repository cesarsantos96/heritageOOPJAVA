package com.example.heritage;

public class Pessoa {
    public String nome;
    public String cpf;
    public int idade;

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        }

        public void escreverDados(){
            System.out.println("Nome: "+ this.nome);
            System.out.println("CPF: "+ this.cpf);
            System.out.println("Idade: "+ this.idade);
            System.out.println("--------- ------- -------------");

    }

}
