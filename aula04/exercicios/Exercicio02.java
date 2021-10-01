package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero;
        int cont = 0;
        System.out.printf("%nTabuada de: ");
        numero = teclado.nextInt();

        while(cont <= 10) {
            //System.out.println(numero + " * " + cont + " = " + (numero * cont));
            System.out.printf("%d * %2d = %02d%n", numero, cont, numero * cont);
            cont++;
        }

        teclado.close();

    }
}
