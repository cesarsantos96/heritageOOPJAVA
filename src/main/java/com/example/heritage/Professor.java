package com.example.heritage;

public class Professor extends Pessoa {

public float salario;
    public Professor(String nome, String cpf, int idade, float salario) {
        super(nome, cpf, idade);
        this.salario = salario;
    }

    public  void ensinar(){
        System.out.println("-------");
        System.out.println(this.nome + " está ensinando essa matéria");
    }

}
