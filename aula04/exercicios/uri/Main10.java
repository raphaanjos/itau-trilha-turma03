package exercicios.uri;

import java.util.Scanner;

/* 
	1117
Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas 
(uma nota válida deve pertencer ao intervalo [0,10]). 
Cada nota deve ser validada separadamente.

Entrada
A entrada contém vários valores reais, positivos ou negativos. 
O programa deve ser encerrado quando forem lidas duas notas válidas.

Saída
Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. 
O valor deve ser apresentado com duas casas após o ponto decimal.

*/
public class Main10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double notas[] = new double[2];
        double somaNotasValidas, media, nota;
        int totalNotasValidas, cont;

        somaNotasValidas = 0;
        media = 0;
        totalNotasValidas = 0;
        cont = 0;

        while (totalNotasValidas < 2) {
            nota = teclado.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida.");
            }else {
                totalNotasValidas += 1;
                notas[cont] = nota;
                somaNotasValidas += notas[cont];
                cont++;
            }
        }

        media = somaNotasValidas / totalNotasValidas;
        System.out.println("media = " + media);
        teclado.close();
    }
}
