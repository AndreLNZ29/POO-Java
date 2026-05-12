package Universidade.Prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {

    public ProvaAV3UCB(ProvaUniversidade provaUniversidade) {

        super(provaUniversidade);
    }

    @Override
    public boolean habilitadoRealizarProva() {

        return true;
    }

    public double calcularNovaMedia(double notaAV3) {

        double maiorNota;

        if (provaUniversidade.av1 > provaUniversidade.av2) {

            maiorNota = provaUniversidade.av1;

        } else {

            maiorNota = provaUniversidade.av2;
        }

        return (maiorNota + notaAV3) / 2;
    }
}