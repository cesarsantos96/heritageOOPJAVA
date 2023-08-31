package com.example.heritage;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, int idade, String matricula) {
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public void estudar(){
        System.out.println("--------------");
        System.out.println(this.nome + " está estudando essa matéria");
        System.out.println("---------------");
    }

}

