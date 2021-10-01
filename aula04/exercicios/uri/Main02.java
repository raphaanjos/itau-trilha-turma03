package exercicios.uri;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, produto;

        a = scan.nextInt();
        b = scan.nextInt();

        produto = a * b;

        scan.close();

        System.out.println("PROD = " + produto);
    }
    
}
