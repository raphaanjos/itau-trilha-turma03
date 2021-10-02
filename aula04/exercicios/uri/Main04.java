package exercicios.uri;

import java.util.Scanner;

/* 
	1035
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D, ambos,
forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", 
senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.
*/

public class Main04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, D;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        if ((B > C && D > A) && (C + D > A + B) && (C > 0 && D > 0) && A % 2 == 0) {
            System.out.printf("Valores aceitos%n");
        } else {
            System.out.printf("Valores não aceitos%n");
        }
        scan.close();
    }
}
