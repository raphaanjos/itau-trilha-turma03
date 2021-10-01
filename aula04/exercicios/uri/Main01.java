package exercicios.uri;

import java.util.Scanner;

public class Main01 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, soma;

        a = scan.nextInt();
        b = scan.nextInt();

        soma = a + b;

        scan.close();

        System.out.println("SOMA = " + soma);
    }
}
