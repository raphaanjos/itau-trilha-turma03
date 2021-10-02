package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double notas[] = new double[10];
        double media = 0;
        double totalNotas;
        int qtdAcimaMedia = 0;
        double notasAcimaMedia;

        totalNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a " + (i + 1) + " nota: ");
            notas[i] = input.nextDouble();
            totalNotas += notas[i];
        }

        media = totalNotas / notas.length;

        System.out.println("Notas acima da média: ");
        
        for(int j = 0; j < notas.length; j++){
            if (notas[j] > media) {
                notasAcimaMedia = notas[j];
                System.out.print(notasAcimaMedia + " ");
                qtdAcimaMedia += notasAcimaMedia;
            }
        }
        System.out.print("Quantidade de notas acima da média: " + qtdAcimaMedia);

        input.close();

    }
}
