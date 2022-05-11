package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.Praticando;

public class Contribuinte {
    String nome;
    String sobrenome;
    int idade;
    int rg;
    String CPF;
    String incorporacao;
    String endereco;


    public Contribuinte(String nome) {
        this.nome = nome;
    }

    public Contribuinte(String nome, String sobrenome) {
        this(nome);
        this.sobrenome = sobrenome;
    }

    public Contribuinte(String nome, String sobrenome, int idade) {
        this(nome, sobrenome);
        this.idade = idade;
    }

    public Contribuinte(String nome, String sobrenome, int idade, int rg) {
        this(nome, sobrenome, idade);
        this.rg = rg;
    }

    public Contribuinte(String nome, String sobrenome, int idade, int rg, String CPF) {
        this(nome, sobrenome, idade, rg);
        this.CPF = CPF;
    }

    public Contribuinte(String nome, String sobrenome, int idade, int rg, String CPF, String incorporacao) {
        this(nome, sobrenome, idade, rg, CPF);
        this.incorporacao = incorporacao;

    }

    public Contribuinte(String nome, String sobrenome, int idade, int rg, String CPF, String incorporacao, String endereco) {
        this(nome, sobrenome, idade, rg, CPF, incorporacao);
        this.endereco = endereco;
    }
}
