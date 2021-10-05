package exercicios.exercicio03;

public class Veiculo {
    
    String modelo;
    String marca;
    private double consumo;

    public Veiculo(String modelo, String marca, double consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    public void modeloMarca() {
        System.out.println("Modelo: " + this.modelo + "\nMarca: " + this.marca);
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setConsumo(double novoConsumo) {
        if (novoConsumo > 0) {
            this.consumo = novoConsumo;
        }
        
    }
}
