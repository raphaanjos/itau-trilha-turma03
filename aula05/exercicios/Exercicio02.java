package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        double mediaGeral;
        double mediaPorTurma;
        double media;
        final int NUM_ALUNOS = 2;
        final int NUM_TURMAS = 2;

        mediaGeral = 0;
        for(int l = 0; l < NUM_TURMAS; l++) {
            System.out.println("Turma " + (l+1));

            mediaPorTurma = 0;
            for(int c = 1; c <= NUM_ALUNOS; c++) {
                System.out.printf("Média do %dº aluno: ", c);
                media = scan.nextDouble();
                mediaPorTurma += media;
            }

            mediaPorTurma /= NUM_ALUNOS;
            System.out.printf("Média por turma: %.2f%n", mediaPorTurma);

            mediaGeral += mediaPorTurma;
            System.out.println();
        };

        mediaGeral /= NUM_TURMAS;
        System.out.printf("Média geral: %.2f%n", mediaGeral);
        scan.close();
    }
}
