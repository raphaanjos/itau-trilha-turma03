package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Menor de três números inteiros.");
        System.out.println("Informe os números.");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        teclado.close();

        int menor = menorNum(1, 2, 3);
        System.out.println(menor + " é menor que " + num2 + " e " + num3);
        System.out.println(menor + " é menor que " + num1 + " e " + num3);
        System.out.println(menor + " é menor que " + num1 + " e " + num2);
    }

    static int menorNum(int num1, int num2, int num3) {
        if (num1 <= num2 & num1 <= num3){
            return num1;

        } else if (num2 <= num3) {
           return num2;

        } else {            
            return num3;
        }
    }
}
