package exercicios.exercicio03;

public class AppVeiculo {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Creta 2.0", "Hyundai", 6.9);
        v1.modeloMarca();
        System.out.println("Consumo por km/l: " + v1.getConsumo());
        v1.setConsumo(-10);
        System.out.println("Consumo por km/l: " + v1.getConsumo());

    }

}
