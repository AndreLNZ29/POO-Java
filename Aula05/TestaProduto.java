package com.example;

public class TestaProduto {

    public static void main(String[] args) {
        produto p1 = new produto("Arroz", 20, 10);
        produto p2 = new produto("Feijão", 10, 5);

        p1.exibirinformacoes();
        System.out.println("");

        p1.adicionarAoEstoque(4);
        p1.exibirinformacoes();
        System.out.println("");

        p1.removerDoEstoque(3);
        p1.exibirinformacoes();
        System.out.println("");

        p2.exibirinformacoes();
        System.out.println("");

        p2.adicionarAoEstoque(2);
        p2.exibirinformacoes();
        System.out.println("");

        p2.removerDoEstoque(9);
        p2.exibirinformacoes();
        System.out.println("");
    }
}
