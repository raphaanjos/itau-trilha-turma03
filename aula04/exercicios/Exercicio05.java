package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int num; 
        int par = 0;
        int impar = 0;
        final int QTD_NUMEROS = 10;

        System.out.printf("Digite %d números inteiros.%n", QTD_NUMEROS);
        for(int cont = 1; cont <= QTD_NUMEROS; cont++){
            System.out.printf("Digite o %dº número: ", cont);
            num = teclado.nextInt();

            if (num % 2 == 0) {
                par += 1;
            }else {
                impar += 1;
            }
        }
        teclado.close();

        System.out.println("Total números pares: " + par);
        System.out.println("Total números ímpares: " + impar);

        

        


    }
}
