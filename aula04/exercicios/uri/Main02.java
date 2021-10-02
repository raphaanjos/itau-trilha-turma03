package exercicios.uri;

import java.util.Scanner;

/*
	1004 
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua 
esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, 
com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, 
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

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
