package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num, maior, menor;

        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;

        System.out.printf("%n");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %d número: ", (i+1));
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        

        System.out.printf("O maior número é %d%n", maior);
        System.out.printf("O menor número é %d%n", menor);
        scan.close();

    }
}