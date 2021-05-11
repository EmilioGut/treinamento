package exercicios.exercicio02;

public class Placar {
    private String time1, time2;
    private int golsTime1, golsTime2;

    public Placar() {
        // time1 = "Time da casa";
        // time2 = "Visitante";
        this("Time da casa", "Visitante", 0, 0);
    }

    public Placar(String time1, String time2) {
        // this.time1 = time1;
        // this.time2 = time2;
        this(time1, time2, 0, 0); // chama o construtor da classe
    }

    public Placar(String time1, String time2, int golsTime1, int golsTime2) {
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    public String exibirPlacar() {
        return time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2;
    }
}
