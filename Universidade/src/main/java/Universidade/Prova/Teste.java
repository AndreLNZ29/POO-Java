package Universidade.Prova;
import Universidade.Prova.ProvaUCB;
import Universidade.Prova.ProvaFafifo;

import java.sql.SQLOutput;

public class Teste {
    public static void main() {
        ProvaUCB ucb = new ProvaUCB(8, 6, 9);
        System.out.println("=== UCB ===");

        double mediaUCB = ucb.calcularMedia();

        System.out.println("Media" +  mediaUCB);

        if (ucb.aprovado()){
            System.out.println("Aprovado");

        }else {
            System.out.println("Reprovado");
        }

        ProvaFafifo fafifo = new ProvaFafifo(5, 6, 7);

        System.out.println("\n=== FAFIFO ===");

        double mediaFafifo = fafifo.calcularMedia();

        System.out.println("Media" + mediaFafifo);

        if (fafifo.aprovado()){
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");
        }

    }
}



