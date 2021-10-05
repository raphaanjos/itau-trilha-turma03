
public class Placar {
    String timeCasa;
    String timeVisitante;
    int pontuacaoTimeCasa;
    int pontuacaoTimeVisitante;

    public Placar() {
        this("Time Casa", "Time visitante", 0, 0);
    }

    public Placar(String timeCasa, String timeVisitante) {
        this(timeCasa, timeVisitante, 0, 0);
    }

    public Placar(String timeCasa, String timeVisitante, int pontuacaoTimeCasa, int pontuacaoTimeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.pontuacaoTimeCasa = pontuacaoTimeCasa;
        this.pontuacaoTimeVisitante = pontuacaoTimeVisitante;
    }

    public String toString() {
        return timeCasa + " " + pontuacaoTimeCasa + " X " + pontuacaoTimeVisitante + " " + timeVisitante;
    }




}
