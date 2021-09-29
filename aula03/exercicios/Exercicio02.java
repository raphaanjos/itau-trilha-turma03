package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.print("Informe a primeira nota do aluno: ");
        nota1 = teclado.nextDouble();

        System.out.print("Informe a segunda nota do aluno: ");
        nota2 = teclado.nextDouble();

        media = (nota1 * 0.4 + nota2 * 0.6);

        if (media >= 6.0) {
            System.out.println("A provado! Média " + media);
        }else {
            System.out.println("Reprovado! Média " + media);
        }

        teclado.close();


    }
}
