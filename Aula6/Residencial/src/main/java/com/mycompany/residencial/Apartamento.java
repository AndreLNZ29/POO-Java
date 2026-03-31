/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.residencial;

/**
 *
 * @author andre.noleto
 */
public class Apartamento extends Residencial {
    private int andar;
    private boolean solNascente;
    private String torre;
    
    public Apartamento (int qtdVagasGaragem, int qtdQuartos, int qtdSuites, int andar, boolean solNascente, String torre){
        super(qtdVagasGaragem, qtdQuartos, qtdSuites);
        this.andar = andar;
        this.solNascente = solNascente;
        this.torre = torre;
    }

    public int getAndar() {
        return andar;
    }

    public boolean isSolNascente() {
        return solNascente;
    }

    public String getTorre() {
        return torre;
    }
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Andar: " + andar);
        System.out.println("Torre: " + torre);
        System.out.println("sol nascente: " + solNascente);

    }

    
    
    
}
