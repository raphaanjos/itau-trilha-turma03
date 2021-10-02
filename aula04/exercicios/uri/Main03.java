package exercicios.uri;

import java.util.Scanner;

/* 	1006
Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e 
com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, não esqueça de 
imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

*/

public class Main03 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A, B, C, MEDIA;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        MEDIA=((A*2) + (B*3) + (C*5)) / 10;

        System.out.printf("MEDIA = %.1f%n", MEDIA);
        scan.close();
    }
}
