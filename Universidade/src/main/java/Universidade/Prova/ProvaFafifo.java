package Universidade.Prova;

public class ProvaFafifo extends ProvaUniversidade {

    public ProvaFafifo(double av1, double av2, double av3) {

        super(av1, av2, av3);

        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 3;

        this.mediaMinima = 6;
    }

    @Override
    public double calcularMedia() {

        double somaPesos = pesoAv1 + pesoAv2 + pesoAv3;

        return ((av1 * pesoAv1) +
                (av2 * pesoAv2) +
                (av3 * pesoAv3)) / somaPesos;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {

        return new ProvaFinalFafifo(this);
    }
}