package com.company.orientacao_a_objetos.orientacao_a_objetos_parte2.Praticando;


public class TesteDadosdoContribuinte {
    public static void main(String[] args) {
        Contribuinte p1 = new Contribuinte("João Vicente","Gonçalves Xavier",54,15576,"88915280725","24/05/1988","Rua Conselheiro Mafra nº35");
        System.out.println("Nome: \"" + p1.nome +  "\" Sobrenome: \"" +p1.sobrenome+ "\" tem " + p1.idade + " anos.");
        System.out.println("RG:" +p1.rg+ "\" CPF: \"" +p1.CPF+ "\" Incorporação: \"" +p1.incorporacao+ "\" Endereço: "+p1.endereco);
        System.out.println("__________________________________________________________________________________________________________");
        Contribuinte p2 = new Contribuinte("Ofélia","Sacramento",51,13587,"88877788455","18/03/1989","Rua Aguiar Barboza nº45");
        System.out.println("Nome: \"" + p2.nome +  "\" Sobrenome: \"" +p2.sobrenome+ "\" tem " + p2.idade + " anos.");
        System.out.println("RG:" +p2.rg+ "\" CPF: \"" +p2.CPF+ "\" Incorporação: \"" +p2.incorporacao+ "\" Endereço: "+p2.endereco);
        System.out.println("__________________________________________________________________________________________________________");
    }
}