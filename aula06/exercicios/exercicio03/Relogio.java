package exercicios.exercicio03;

public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinutos(minuto);
        setSegundos(segundo); 
    }

    public void setHora(int hora) {
        if (hora >= 0 && minuto < 24) {
            this.hora = hora;
        }
    }

    public int getHoras() {
        return this.hora;
    }

    public void setMinutos(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }
    
    public int getMinutos() {
        return this.minuto;
    }

    public void setSegundos(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public int getSegundos() {
        return this.segundo;
    }

    public void fullHorario() {
        System.out.println(this.hora + ":" + this.minuto + ":" + this.segundo);
    }

}
