package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double ladoA, ladoB, ladoC;

        System.out.println("Insira um valor: ");
        ladoA = entrada.nextDouble();

        System.out.println("Insira o segundo valor: ");
        ladoB = entrada.nextDouble();

        System.out.println("Insira o terceiro valor: ");
        ladoC = entrada.nextDouble();

        if (ladoA > (ladoB + ladoC) || ladoB > (ladoA + ladoC) || ladoC > (ladoA + ladoB)) {
            System.out.println("As medias informadas não formam triângulo algum.");
        }else {
            if (ladoA == ladoB && ladoA == ladoC && ladoC == ladoB) {
                System.out.println("As medias informadas formam um triângulo equilátero.");
            }else if (ladoA == ladoB || ladoA == ladoC || ladoC == ladoB) {
                System.out.println("As medias informadas formam um triângulo isósceles.");
            } else {
                System.out.println("As medias informadas formam um triângulo escaleno.");
            }
        }

        entrada.close();
    }
}
