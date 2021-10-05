
package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        boolean resultado;

        System.out.println("Informe um número e verifique se é par ou ímpar: ");
        numero = scan.nextInt();
        scan.close();

        resultado = trueFalse(numero);
        if (resultado) {
            System.out.println(resultado + " é par.");

        }else {
            System.out.println(resultado + " é ímpar.");
        }
        
    }

    static boolean trueFalse(int num) {

        /* if (num % 2 == 0) {
            return true;
        }else {
            return false;
        } */

        return (num % 2 == 0);
    }
}