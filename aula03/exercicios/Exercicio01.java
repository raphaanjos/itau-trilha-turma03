package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = teclado.nextInt();

        if(num > 20) {
            double resultado = num / 2.0;
            System.out.println("O resultado é: " + resultado);
        }

        System.out.println("Fim do programa.");
        teclado.close();
    }
}
