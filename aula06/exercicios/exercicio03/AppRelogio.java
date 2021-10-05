package exercicios.exercicio03;

public class AppRelogio {

    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 31, 50);

        System.out.println(relogio.getHora() + ":" + relogio.getMinuto() + ":" + relogio.getSegundo());

        relogio.setHora(-15);
        relogio.setMinuto(-30);
        relogio.setSegundo(-50);

        System.out.println(relogio.getHora() + ":" + relogio.getMinuto() + ":" + relogio.getSegundo());
        relogio.fullHorario();
        relogio.horaFull();

    }
}
