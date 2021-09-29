package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double num1, num2;

        System.out.print("Informe um número real positivo: ");
        num1 = teclado.nextDouble();
        System.out.print("Informe o segundo número real positivo: ");
        num2 = teclado.nextDouble();

        if (num1 > num2) {
            System.out.println("Em ordem decrescente: " + num1 + ", " + num2);

        } else {
            System.out.println("Em ordem crescente: " + num1 + ", " + num2);

        }

        teclado.close();
    }
}
