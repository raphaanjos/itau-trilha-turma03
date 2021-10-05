package exercicios.exercicio03;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    // construtor
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo); 
    }

    public void setHora(int hora) {
        if (hora >= 0 && minuto < 24) {
            this.hora = hora;
        }
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }
    
    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void fullHorario() {
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }

    public void horaFull() {
        System.out.printf("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

}
