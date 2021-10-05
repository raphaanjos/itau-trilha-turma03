package exercicios.exercicio03;

public class AppRelogio {
    
    public static void main(String[] args) {
        Relogio relogio = new Relogio(15, 31, 50);

        System.out.println(relogio.getHoras() + ":" + relogio.getMinutos() + ":" + relogio.getSegundos());

        relogio.setHora(-15);
        relogio.setMinutos(-30);
        relogio.setSegundos(-50);

        System.out.println(relogio.getHoras() + ":" + relogio.getMinutos() + ":" + relogio.getSegundos());
        relogio.fullHorario();

    }
}
