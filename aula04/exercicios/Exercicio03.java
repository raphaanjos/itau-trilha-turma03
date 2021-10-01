package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n;
        int cont = 1;

        System.out.println("Digite um valor inteiro positivo: ");
        n = teclado.nextInt();

        while(cont <= n) {
            if (cont <= n / 2) {
                System.out.printf("%d, ", cont);
            }else {
                System.out.printf("%d ", cont);
            }
            cont *= 2;
        }

        teclado.close();
    }
}
