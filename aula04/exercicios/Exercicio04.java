package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero;
        int cont = 1;
        int stop = 1;
        int soma = 0;

        while(stop != 0) {
            System.out.printf("Digite o %dº número: ", cont);
            numero = teclado.nextInt();
            if (numero != 0) {
                soma += numero;
               
            }else {
                stop = 0;
                System.out.printf("Total %d%n", soma);
            }
            cont++;
        }
        teclado.close();
    }
}
