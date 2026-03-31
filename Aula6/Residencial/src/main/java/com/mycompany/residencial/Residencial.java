/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.residencial;

/**
 *
 * @author andre.noleto
 */
public class Residencial {

    private int qtdVagasGaragem;
    private int qtdQuartos;
    private int qtdSuites;

    public Residencial(int qtdVagasGaragem, int qtdQuartos, int qtdSuites) {
        this.qtdVagasGaragem = qtdVagasGaragem;
        this.qtdQuartos = qtdQuartos;
        this.qtdSuites = qtdSuites;
    }

    public int getQtdVagasGaragem() {
        return qtdVagasGaragem;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public int getQtdSuites() {
        return qtdSuites;
    }

    public void mostrarDados() {
        System.out.println("quantidades de vagas: " + qtdVagasGaragem);
        System.out.println("quantidades de Quartos: " + qtdQuartos);
        System.out.println("quantidae de Suite: " + qtdSuites);
    
    }
}
