package Universidade.Prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {

    public ProvaFinalFafifo(ProvaUniversidade provaUniversidade) {

        super(provaUniversidade);
    }

    @Override
    public boolean habilitadoRealizarProva() {

        return !provaUniversidade.aprovado();
    }

    public double calcularMediaFinal(double notaFinal) {

        double mediaAtual = provaUniversidade.calcularMedia();

        return (mediaAtual + notaFinal) / 2;
    }
}