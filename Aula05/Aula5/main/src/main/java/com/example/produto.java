package com.example;

public class produto {
    private String nome;
    private double preco;
    private int  qtdEstoque;

    public produto (String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void exibirinformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("preço do produto: " + preco);
        System.out.println("Quantidade do produto: " + qtdEstoque);
    }

    public void adicionarAoEstoque(int qtd){
        qtdEstoque = qtdEstoque + qtd;
    }

    public void removerDoEstoque(int qtd){
        if (qtdEstoque < qtd){
            System.out.println("ERRO: itens insuficientes para remover");
                    System.out.println("");
        } else{
            qtdEstoque = qtdEstoque - qtd;
            System.out.println("Removido com sucesso");
                    System.out.println("");
        }
        
    }
}
