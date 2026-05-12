package Universidade.Prova;

public class ProvaUCB extends ProvaUniversidade {

    public ProvaUCB(double av1, double av2, double av3) {

        super(av1, av2, av3);

        this.pesoAv1 = 1;
        this.pesoAv2 = 1;
        this.pesoAv3 = 1;

        this.mediaMinima = 7;
    }

    @Override
    public double calcularMedia() {

        return (av1 + av2) / 2;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {

        return new ProvaAV3UCB(this);
    }
}