package exercicios.uri;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, D;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        if ((B > C && D > A) && ((C + D > A + B) && (C > 0)) && (D > 0 && A % 2 == 0)) {
            System.out.printf("Valores aceitos%n");
        } else {
            System.out.printf("Valores não aceitos%n");
        }

        scan.close();

        scan.close();

    }
}
