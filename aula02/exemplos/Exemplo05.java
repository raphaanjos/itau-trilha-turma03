package exemplos;

import java.util.Scanner;

public class Exemplo05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso;

        System.out.print("Informe o seu peso: ");
        peso = input.nextDouble();

        System.out.println("Você tem " + peso + "kg.");

        input.close();
    }
    
}
