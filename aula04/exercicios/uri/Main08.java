package exercicios.uri;

import java.util.Scanner;

/* 
	1064
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante.
Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos.
A próxima linha deve mostrar a média dos valores positivos digitados.

*/



public class Main08 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero, mediaDePosivitos, somaNumeros;
        int totalPosivitos;
        final int QTD_NUMEROS = 6;

        totalPosivitos = 0;
        somaNumeros = 0;
        
        for (int i = 1; i <= QTD_NUMEROS; i++) {
            numero = input.nextDouble();

            if (numero >= 0) {
                totalPosivitos += 1;
                somaNumeros += numero;
            }
          
        }
        mediaDePosivitos = somaNumeros / totalPosivitos;
        System.out.println(totalPosivitos + " valores positivos");
        System.out.printf("%.1f\n", mediaDePosivitos);
        input.close();

    }
}
